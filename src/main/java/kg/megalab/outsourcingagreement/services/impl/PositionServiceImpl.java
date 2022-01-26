package kg.megalab.outsourcingagreement.services.impl;

import kg.megalab.outsourcingagreement.models.Positions;
import kg.megalab.outsourcingagreement.repo.PositionsRepo;
import kg.megalab.outsourcingagreement.services.PositionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {
    private PositionsRepo positionsRepo;

    public PositionServiceImpl(PositionsRepo positionRepo) {
        this.positionsRepo=positionRepo;
    }

    @Override
    public Positions savePosition(Positions positions) {
        positions=positionsRepo.save(positions);
        return null;
    }

    @Override
    public List<Positions> getAll() {
        return positionsRepo.findAll();
    }

    @Override
    public Positions deletePosition(Positions positions) {
        positionsRepo.delete(positions);
        return null;
    }

}
