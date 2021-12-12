package sixhours.com.dynamicForm.controllers;

import org.springframework.web.bind.annotation.*;
import sixhours.com.dynamicForm.models.entities.Form;
import sixhours.com.dynamicForm.models.entities.FormField;
import sixhours.com.dynamicForm.models.entities.FormFieldType;
import sixhours.com.dynamicForm.models.repositories.FormFieldRepository;
import sixhours.com.dynamicForm.models.repositories.FormFieldTypeRepository;
import sixhours.com.dynamicForm.models.repositories.FormRepository;

import java.util.List;

@RestController
public class FormFieldController {
    private final FormRepository formRepository;
    private final FormFieldRepository formFieldRepository;
    private final FormFieldTypeRepository formFieldTypeRepository;

    public FormFieldController(
            FormRepository formRepository,
            FormFieldRepository formFieldRepository,
            FormFieldTypeRepository formFieldTypeRepository
    ) {
        this.formRepository = formRepository;
        this.formFieldRepository = formFieldRepository;
        this.formFieldTypeRepository = formFieldTypeRepository;
    }

    @GetMapping("/forms/{id}/formFields")
    List<FormField> all() {
        return formFieldRepository.findAll();
    }

    @PostMapping("/forms/{id}/formFields")
    FormField newForm(@PathVariable Long id, @RequestBody FormField newFormField) {
        Form form = this.formRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not found form field type " + id));
        FormFieldType formFieldType = this.formFieldTypeRepository.findById(newFormField.getFormFieldType().getId())
                .orElseThrow(() -> new RuntimeException("Could not found form field type " + id));

        FormField formField = new FormField(
                formFieldType,
                form,
                newFormField.getFormFieldLabel(),
                newFormField.isFormFieldIsRequired(),
                newFormField.getFormFieldOptionsValues(),
                newFormField.getFormFieldProperties()
        );

        return formFieldRepository.save(formField);
    }
}
