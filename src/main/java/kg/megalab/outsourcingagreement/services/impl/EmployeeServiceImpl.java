package kg.megalab.outsourcingagreement.services.impl;

import kg.megalab.outsourcingagreement.models.Employees;
import kg.megalab.outsourcingagreement.repo.EmployeeRepo;
import kg.megalab.outsourcingagreement.services.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo){
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employees saveEmployee(Employees employees) {
        employees = employeeRepo.save(employees);
        return null;
    }

    @Override
    public List<Employees> getAll() {
        return employeeRepo.findAll();
    }

    @Override
    public Employees deleteEmployee(Employees employees) {
        employeeRepo.delete(employees);
        return null;
    }
}
