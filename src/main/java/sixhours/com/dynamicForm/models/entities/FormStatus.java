package sixhours.com.dynamicForm.models.entities;

import sixhours.com.dynamicForm.enums.FormStatusEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class FormStatus {
    @Id
    @GeneratedValue
    private Long id;

    private FormStatusEnum name;

    FormStatus() {
    }

    public FormStatus(FormStatusEnum name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormStatusEnum getName() {
        return name;
    }

    public void setName(FormStatusEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormStatus that = (FormStatus) o;
        return id.equals(that.id) && name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "FormStatus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
