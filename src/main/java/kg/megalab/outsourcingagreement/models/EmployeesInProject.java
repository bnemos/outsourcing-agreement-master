package kg.megalab.outsourcingagreement.models;

import com.sun.istack.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "employeesInProject")
public class EmployeesInProject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    int daysInProject;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "employeesId")
    Employees employeesId;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "projectId")
    Projects projectId;

    public EmployeesInProject() {
    }
}
