package by.flameksandr.practical.coding.practicalcoding.repository;

import by.flameksandr.practical.coding.practicalcoding.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
