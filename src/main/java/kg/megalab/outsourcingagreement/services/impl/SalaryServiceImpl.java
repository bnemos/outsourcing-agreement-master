package kg.megalab.outsourcingagreement.services.impl;

import kg.megalab.outsourcingagreement.models.Salaries;
import kg.megalab.outsourcingagreement.repo.SalaryRepo;
import kg.megalab.outsourcingagreement.services.SalaryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryServiceImpl implements SalaryService {

    private SalaryRepo salaryRepo;

    public SalaryServiceImpl(SalaryRepo salaryRepo){
        this.salaryRepo=salaryRepo;
    }

    @Override
    public Salaries saveSalary(Salaries salaries) {
        salaries = salaryRepo.save(salaries);
        return null;
    }

    @Override
    public List<Salaries> getAllSalary() {

        return salaryRepo.findAll();
    }

    @Override
    public Salaries deleteSalary(Salaries salaries) {
        salaryRepo.delete(salaries);
        return null;
    }
}
