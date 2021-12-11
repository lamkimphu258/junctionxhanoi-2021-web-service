package sixhours.com.dynamicForm.controllers;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sixhours.com.dynamicForm.models.entities.FormStatus;
import sixhours.com.dynamicForm.models.repositories.FormStatusRepository;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class FormStatusController {
    private final FormStatusRepository repository;

    public FormStatusController(FormStatusRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/formStatus")
    List<FormStatus> all() {
        return repository.findAll();
    }

    @GetMapping("/formStatus/{id}")
    FormStatus one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not found form status " + id));
    }
}
