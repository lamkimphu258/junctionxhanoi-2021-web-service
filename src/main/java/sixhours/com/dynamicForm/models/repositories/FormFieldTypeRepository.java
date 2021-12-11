package sixhours.com.dynamicForm.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sixhours.com.dynamicForm.models.entities.FormFieldType;

public interface FormFieldTypeRepository extends JpaRepository<FormFieldType, Long> {
}
