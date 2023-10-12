package by.flameksandr.practical.coding.practicalcoding.repository;

import by.flameksandr.practical.coding.practicalcoding.entity.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmployeeRepositoryP extends PagingAndSortingRepository<Employee, Long> {
    Page<Employee> findAll(Pageable pageable);
}
