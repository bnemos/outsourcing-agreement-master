package kg.megalab.outsourcingagreement.controllers;

import kg.megalab.outsourcingagreement.models.Employees;
import kg.megalab.outsourcingagreement.models.Positions;
import kg.megalab.outsourcingagreement.services.PositionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/position")
@AllArgsConstructor
public class PositionController {

    private PositionService positionService;

    @PostMapping("/save")
    public Positions savePosition(@RequestBody Positions positions)
    {
        return positionService.savePosition(positions);
    }

    @GetMapping("/getAll")
    public List<Positions> getPositions()
    {
        return positionService.getAll();
    }

    @PutMapping("/update")
    public Positions updatePosition(@RequestBody Positions positions)
    {
        return positionService.savePosition(positions);
    }

    @DeleteMapping("/delete")
    public Positions deletePosition(@RequestBody Positions positions)
    {
        return positionService.deletePosition(positions);
    }
}
