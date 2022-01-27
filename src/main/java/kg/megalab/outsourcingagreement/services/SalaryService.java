package kg.megalab.outsourcingagreement.services;

import kg.megalab.outsourcingagreement.models.Salaries;

import java.util.List;

public interface SalaryService {

    Salaries saveSalary(Salaries salaries);

    List<Salaries> getAllSalary();

    Salaries deleteSalary(Salaries salaries);
}
