package sixhours.com.dynamicForm.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sixhours.com.dynamicForm.models.entities.Form;

public interface FormRepository extends JpaRepository<Form, Long> {
}
