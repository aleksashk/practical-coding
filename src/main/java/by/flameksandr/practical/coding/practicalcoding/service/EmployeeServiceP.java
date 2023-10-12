package by.flameksandr.practical.coding.practicalcoding.service;

import by.flameksandr.practical.coding.practicalcoding.entity.Employee;
import by.flameksandr.practical.coding.practicalcoding.repository.EmployeeRepositoryP;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceP {
    private EmployeeRepositoryP employeeRepositoryP;

    public EmployeeServiceP(EmployeeRepositoryP employeeRepositoryP) {
        this.employeeRepositoryP = employeeRepositoryP;
    }

    public Page<Employee> fetchEmployeeWithPagination(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        return employeeRepositoryP.findAll(pageable);
    }
}
