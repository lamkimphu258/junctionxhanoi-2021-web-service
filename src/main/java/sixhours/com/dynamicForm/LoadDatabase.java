package sixhours.com.dynamicForm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sixhours.com.dynamicForm.models.entities.FormStatus;
import sixhours.com.dynamicForm.models.repositories.FormStatusRepository;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(FormStatusRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new FormStatus("active")));
            log.info("Preloading " + repository.save(new FormStatus("inactive")));
            log.info("Preloading " + repository.findAll());
        };
    }
}
