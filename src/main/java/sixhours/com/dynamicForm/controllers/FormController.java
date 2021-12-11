package sixhours.com.dynamicForm.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import sixhours.com.dynamicForm.models.entities.Form;
import sixhours.com.dynamicForm.models.entities.FormStatus;
import sixhours.com.dynamicForm.models.repositories.FormRepository;

import java.util.List;

@RestController
public class FormController {
    private final FormRepository formRepository;

    private static final Logger log = LoggerFactory.getLogger(FormController.class);

    public FormController(FormRepository finalRepository) {
        this.formRepository = finalRepository;
    }

    @GetMapping("/forms")
    List<Form> all() {
        return formRepository.findAll();
    }

    @GetMapping("/forms/{id}")
    Form one(@PathVariable Long id) {
        return formRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Could not found form field type " + id));
    }

//    @PostMapping("/forms")
//    Form newForm(@RequestBody Form newForm) {
//        System.out.println(newForm);
//        return formRepository.save(newForm);
//    }

    @PostMapping("/forms")
    Form newForm(@RequestBody Form newForm) {
        log.info(newForm.toString());
        return formRepository.save(newForm);
    }
}
