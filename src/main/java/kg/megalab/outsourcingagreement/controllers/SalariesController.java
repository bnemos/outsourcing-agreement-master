package kg.megalab.outsourcingagreement.controllers;

import kg.megalab.outsourcingagreement.models.Salaries;
import kg.megalab.outsourcingagreement.services.SalaryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/salaries")
public class SalariesController {

    private SalaryService salaryService;

    @PostMapping("/save")
    public Salaries saveSalary(@RequestBody Salaries salaries)
    {
        return salaryService.saveSalary(salaries);
    }

    @GetMapping("/getAll")
    public List<Salaries> getAllSalary()
    {
        return salaryService.getAllSalary();
    }

    @PutMapping("/update")
    public Salaries updateSalary(@RequestBody Salaries salaries){
        return salaryService.saveSalary(salaries);
    }

    @DeleteMapping("/delete")
    public Salaries deleteSalaries(@RequestBody Salaries salaries)
    {
        return salaryService.deleteSalary(salaries);
    }
}
