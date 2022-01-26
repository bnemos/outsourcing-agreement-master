package kg.megalab.outsourcingagreement.services;

import kg.megalab.outsourcingagreement.models.Employees;

import java.util.List;


public interface EmployeeService {
    Employees saveEmployee(Employees employees);

    List<Employees> getAll();

    Employees deleteEmployee(Employees employees);
}
