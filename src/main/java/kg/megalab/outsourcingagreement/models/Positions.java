package kg.megalab.outsourcingagreement.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "positions")
public class Positions {
    @Id
    Long id;
    @Column
    String title;
    boolean isActive;
}
