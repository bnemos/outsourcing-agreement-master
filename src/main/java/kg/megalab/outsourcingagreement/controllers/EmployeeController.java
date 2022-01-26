package kg.megalab.outsourcingagreement.controllers;


import kg.megalab.outsourcingagreement.models.Employees;
import kg.megalab.outsourcingagreement.repo.EmployeeRepo;
import kg.megalab.outsourcingagreement.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employees saveEmployee(@RequestBody Employees employees)
    {
        return employeeService.saveEmployee(employees);
    }

    @GetMapping("/getAll")
    public List<Employees> getEmployees()
    {
        return employeeService.getAll();
    }

    @PutMapping("/update")
    public Employees updateEmployee(@RequestBody Employees employees)
    {
        return employeeService.saveEmployee(employees);
    }

    @DeleteMapping("/delete")
    public Employees deleteEmployees(@RequestBody Employees employees)
    {
        return employeeService.deleteEmployee(employees);
    }



}
