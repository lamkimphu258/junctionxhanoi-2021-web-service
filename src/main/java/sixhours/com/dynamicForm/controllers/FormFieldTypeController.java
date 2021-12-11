package sixhours.com.dynamicForm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sixhours.com.dynamicForm.models.entities.FormFieldType;
import sixhours.com.dynamicForm.models.repositories.FormFieldTypeRepository;

import java.util.List;

@RestController
public class FormFieldTypeController {
    private final FormFieldTypeRepository repository;

    public FormFieldTypeController(FormFieldTypeRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/formFieldTypes")
    List<FormFieldType> all() {
        return repository.findAll();
    }

    @GetMapping("/formFieldTypes/{id}")
    FormFieldType one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not found form field type " + id));
    }
}
