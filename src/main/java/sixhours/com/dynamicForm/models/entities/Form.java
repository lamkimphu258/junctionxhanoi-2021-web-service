package sixhours.com.dynamicForm.models.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Form {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "form_status_id", referencedColumnName = "id")
    private FormStatus formStatus;

    private String formCode;

    private String formName;

    private String formDesc;

    public Form() {
    }

    public Form(FormStatus formStatus, String formCode, String formName, String formDesc) {
        this.formStatus = formStatus;
        this.formCode = formCode;
        this.formName = formName;
        this.formDesc = formDesc;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FormStatus getFormStatus() {
        return formStatus;
    }

    public void setFormStatus(FormStatus formStatus) {
        this.formStatus = formStatus;
    }

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public String getFormDesc() {
        return formDesc;
    }

    public void setFormDesc(String formDesc) {
        this.formDesc = formDesc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Form form = (Form) o;
        return id.equals(form.id) && formStatus.equals(form.formStatus) && formCode.equals(form.formCode) && formName.equals(form.formName) && formDesc.equals(form.formDesc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, formStatus, formCode, formName, formDesc);
    }

    @Override
    public String toString() {
        return "Form{" +
                "id=" + id +
                ", formStatus=" + formStatus +
                ", formCode='" + formCode + '\'' +
                ", formName='" + formName + '\'' +
                ", form_desc='" + formDesc + '\'' +
                '}';
    }
}
