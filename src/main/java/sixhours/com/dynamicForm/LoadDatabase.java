package sixhours.com.dynamicForm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sixhours.com.dynamicForm.enums.FormFieldTypeEnum;
import sixhours.com.dynamicForm.enums.FormStatusEnum;
import sixhours.com.dynamicForm.models.entities.FormFieldType;
import sixhours.com.dynamicForm.models.entities.FormStatus;
import sixhours.com.dynamicForm.models.repositories.FormFieldTypeRepository;
import sixhours.com.dynamicForm.models.repositories.FormStatusRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(
            FormStatusRepository formStatusRepository,
            FormFieldTypeRepository formFieldTypeRepository
    ) {

        return args -> {
            for (FormStatusEnum formStatus : FormStatusEnum.values()) {
                log.info("Preloading " + formStatusRepository.save(new FormStatus(formStatus)));
            }

            for (FormFieldTypeEnum formFieldType : FormFieldTypeEnum.values()) {
                log.info("Preloading " + formFieldTypeRepository.save(new FormFieldType(formFieldType)));
            }
        };
    }
}
