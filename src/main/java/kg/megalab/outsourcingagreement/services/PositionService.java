package kg.megalab.outsourcingagreement.services;


import kg.megalab.outsourcingagreement.models.Positions;

import java.util.List;

public interface PositionService {
    Positions savePosition(Positions positions);

    List<Positions> getAll();

    Positions deletePosition(Positions positions);
}
