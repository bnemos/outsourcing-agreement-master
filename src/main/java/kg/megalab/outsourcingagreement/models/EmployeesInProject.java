package kg.megalab.outsourcingagreement.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}
