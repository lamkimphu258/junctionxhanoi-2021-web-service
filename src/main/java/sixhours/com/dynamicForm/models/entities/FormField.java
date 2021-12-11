package sixhours.com.dynamicForm.models.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Entity
public class FormField {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "form_field_type_id", referencedColumnName = "id")
    private FormFieldType formFieldType;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "form_id", referencedColumnName = "id")
    private Form form;

    private String formFieldLabel;

    private boolean formFieldIsRequired;

    private String[] formFieldOptionsValues;

    private HashMap<String, String> formFieldProperties;

    public FormField(FormFieldType formFieldType, Form form, String formFieldLabel, boolean formFieldIsRequired, String[] formFieldOptionsValues, HashMap<String, String> formFieldProperties) {
        this.formFieldType = formFieldType;
        this.form = form;
        this.formFieldLabel = formFieldLabel;
        this.formFieldIsRequired = formFieldIsRequired;
        this.formFieldOptionsValues = formFieldOptionsValues;
        this.formFieldProperties = formFieldProperties;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormFieldType getFormFieldType() {
        return formFieldType;
    }

    public void setFormFieldType(FormFieldType formFieldType) {
        this.formFieldType = formFieldType;
    }

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }

    public String getFormFieldLabel() {
        return formFieldLabel;
    }

    public void setFormFieldLabel(String formFieldLabel) {
        this.formFieldLabel = formFieldLabel;
    }

    public boolean isFormFieldIsRequired() {
        return formFieldIsRequired;
    }

    public void setFormFieldIsRequired(boolean formFieldIsRequired) {
        this.formFieldIsRequired = formFieldIsRequired;
    }

    public String[] getFormFieldOptionsValues() {
        return formFieldOptionsValues;
    }

    public void setFormFieldOptionsValues(String[] formFieldOptionsValues) {
        this.formFieldOptionsValues = formFieldOptionsValues;
    }

    public HashMap<String, String> getFormFieldProperties() {
        return formFieldProperties;
    }

    public void setFormFieldProperties(HashMap<String, String> formFieldProperties) {
        this.formFieldProperties = formFieldProperties;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FormField formField = (FormField) o;
        return formFieldIsRequired == formField.formFieldIsRequired && id.equals(formField.id) && formFieldType.equals(formField.formFieldType) && form.equals(formField.form) && formFieldLabel.equals(formField.formFieldLabel) && formFieldOptionsValues.equals(formField.formFieldOptionsValues) && formFieldProperties.equals(formField.formFieldProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formFieldType, form, formFieldLabel, formFieldIsRequired, formFieldOptionsValues, formFieldProperties);
    }

    @Override
    public String toString() {
        return "FormField{" +
                "id=" + id +
                ", formFieldType=" + formFieldType +
                ", form=" + form +
                ", formFieldLabel='" + formFieldLabel + '\'' +
                ", formFieldIsRequired=" + formFieldIsRequired +
                ", formFieldOptionsValues=" + Arrays.toString(formFieldOptionsValues) +
                ", formFieldProperties=" + formFieldProperties +
                '}';
    }
}
