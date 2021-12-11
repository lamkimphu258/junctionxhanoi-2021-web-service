package sixhours.com.dynamicForm.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sixhours.com.dynamicForm.models.entities.FormField;

public interface FormFieldRepository extends JpaRepository<FormField, Long> {
}
