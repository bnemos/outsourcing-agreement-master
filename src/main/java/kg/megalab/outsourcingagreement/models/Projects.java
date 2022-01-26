package kg.megalab.outsourcingagreement.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
@Table(name = "projects")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Projects {
    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column
    String projectName;
    String startDate;
    String endDate;

}
