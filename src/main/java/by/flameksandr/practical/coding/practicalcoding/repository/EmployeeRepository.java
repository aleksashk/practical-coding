package by.flameksandr.practical.coding.practicalcoding.repository;

import by.flameksandr.practical.coding.practicalcoding.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Custom query to find all employees whose first name starts with "A" and sort them by name
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE 'A%' ORDER BY e.firstName ASC, e.lastName ASC")
    List<Employee> findAllAndSortByNameStartingWithA();
}
