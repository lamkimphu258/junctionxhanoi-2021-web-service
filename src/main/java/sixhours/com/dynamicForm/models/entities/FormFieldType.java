package sixhours.com.dynamicForm.models.entities;

import sixhours.com.dynamicForm.enums.FormFieldTypeEnum;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class FormFieldType {
    @Id
    @GeneratedValue
    private Long id;

    private FormFieldTypeEnum name;

    public FormFieldType(FormFieldTypeEnum name) {
        this.name = name;
    }

    public FormFieldType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormFieldTypeEnum getName() {
        return name;
    }

    public void setName(FormFieldTypeEnum name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormFieldType fieldType = (FormFieldType) o;
        return id.equals(fieldType.id) && name.equals(fieldType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "FieldType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
