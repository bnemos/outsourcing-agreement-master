package kg.megalab.outsourcingagreement.models;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "salaries")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Salaries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    double amount;
}
