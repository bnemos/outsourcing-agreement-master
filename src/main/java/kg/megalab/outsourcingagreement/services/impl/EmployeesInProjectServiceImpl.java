package kg.megalab.outsourcingagreement.services.impl;

import kg.megalab.outsourcingagreement.models.EmployeesInProject;
import kg.megalab.outsourcingagreement.repo.EmployeesInProjectRepo;
import kg.megalab.outsourcingagreement.services.EmployeesInProjectService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesInProjectServiceImpl implements EmployeesInProjectService {

    private EmployeesInProjectRepo employeesInProjectRepo;

    public EmployeesInProjectServiceImpl(EmployeesInProjectRepo employeesInProjectRepo) {
        this.employeesInProjectRepo=employeesInProjectRepo;
    }

    @Override
    public EmployeesInProject saveEmployeesInProject(EmployeesInProject employeesInProject) {
        employeesInProject=employeesInProjectRepo.save(employeesInProject);
        return null;
    }

    @Override
    public List<EmployeesInProject> getAll() {
        return employeesInProjectRepo.findAll();
    }

    @Override
    public EmployeesInProject deleteEmployeesInProject(EmployeesInProject employeesInProject) {
        employeesInProjectRepo.delete(employeesInProject);
        return null;
    }
}
