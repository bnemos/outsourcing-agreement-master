package kg.megalab.outsourcingagreement.models;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "employees")
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor

public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String firstName;
    String lastName;
    String patronymic;
    String description;

    @OneToMany(mappedBy = "employeesId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    List<EmployeesInProject> employeesInProject;


    public Employees() {
    }


}
