package kg.megalab.outsourcingagreement.services;

import kg.megalab.outsourcingagreement.models.EmployeesInProject;

import java.util.List;

public interface EmployeesInProjectService {
    EmployeesInProject saveEmployeesInProject(EmployeesInProject employeesInProject);

    List<EmployeesInProject> getAll();

    EmployeesInProject deleteEmployeesInProject(EmployeesInProject employeesInProject);
}
