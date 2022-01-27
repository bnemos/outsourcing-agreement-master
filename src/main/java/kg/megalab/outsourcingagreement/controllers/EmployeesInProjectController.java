package kg.megalab.outsourcingagreement.controllers;

import kg.megalab.outsourcingagreement.models.EmployeesInProject;
import kg.megalab.outsourcingagreement.services.EmployeesInProjectService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/employeesInProject")
@AllArgsConstructor
public class EmployeesInProjectController {

    private EmployeesInProjectService employeesInProjectService;

    @PostMapping("/save")
    public EmployeesInProject saveEmployeeInProject(@RequestBody EmployeesInProject employeesInProject){
        return employeesInProjectService.saveEmployeesInProject(employeesInProject);
    }

    @GetMapping("/getAll")
    public List<EmployeesInProject> getAllEmployeesInProjects()
    {
        return employeesInProjectService.getAll();
    }

    @PutMapping("/update")
    public EmployeesInProject updateEmployeesInProject(@RequestBody EmployeesInProject employeesInProject){
        return employeesInProjectService.saveEmployeesInProject(employeesInProject);
    }

    @DeleteMapping("/delete")
    public EmployeesInProject deleteEmployeesInProject(@RequestBody EmployeesInProject employeesInProject){
        return employeesInProjectService.deleteEmployeesInProject(employeesInProject);
    }
}
