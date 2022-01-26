package kg.megalab.outsourcingagreement.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "employees")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    String firstName;
    String lastName;
    String patronymic;
    String description;
}
