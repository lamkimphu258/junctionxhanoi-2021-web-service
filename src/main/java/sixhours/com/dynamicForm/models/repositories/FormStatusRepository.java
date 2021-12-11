package sixhours.com.dynamicForm.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sixhours.com.dynamicForm.models.entities.FormStatus;

public interface FormStatusRepository extends JpaRepository<FormStatus, Long> {
}
