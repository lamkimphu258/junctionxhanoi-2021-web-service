package sixhours.com.dynamicForm;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sixhours.com.dynamicForm.enums.FormFieldTypeEnum;
import sixhours.com.dynamicForm.enums.FormStatusEnum;
import sixhours.com.dynamicForm.models.entities.Form;
import sixhours.com.dynamicForm.models.entities.FormFieldType;
import sixhours.com.dynamicForm.models.entities.FormStatus;
import sixhours.com.dynamicForm.models.repositories.FormFieldTypeRepository;
import sixhours.com.dynamicForm.models.repositories.FormRepository;
import sixhours.com.dynamicForm.models.repositories.FormStatusRepository;

import java.util.List;
import java.util.Random;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(
            FormStatusRepository formStatusRepository,
            FormFieldTypeRepository formFieldTypeRepository,
            FormRepository formRepository
    ) {

        return args -> {
            Faker faker = new Faker();
            for (FormStatusEnum formStatus : FormStatusEnum.values()) {
                log.info("Preloading " + formStatusRepository.save(new FormStatus(formStatus)));
            }

            for (FormFieldTypeEnum formFieldType : FormFieldTypeEnum.values()) {
                log.info("Preloading " + formFieldTypeRepository.save(new FormFieldType(formFieldType)));
            }

            List<FormStatus> formStatusList = formStatusRepository.findAll();
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                FormStatus randomFormStatus = formStatusList.get(random.nextInt(0, 1));
                String formCode = faker.code().isbn10(true);
                String formName = faker.funnyName().name();
                String formDesc = faker.funnyName().name();
                Form form = new Form(randomFormStatus, formCode, formName, formDesc);
                formRepository.save(form);
            }
        };
    }
}
