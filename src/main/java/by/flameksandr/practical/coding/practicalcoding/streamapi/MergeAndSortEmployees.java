package by.flameksandr.practical.coding.practicalcoding.streamapi;

import by.flameksandr.practical.coding.practicalcoding.streamapi.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MergeAndSortEmployees {
    public static void main(String[] args) {
        List<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee("Alice", 25));
        employees1.add(new Employee("Bob", 32));
        employees1.add(new Employee("Jack", 55));

        List<Employee> employees2 = new ArrayList<>();
        employees2.add(new Employee("Eve", 14));
        employees2.add(new Employee("Brad", 28));
        employees2.add(new Employee("Fred", 32));

        //Merge the employee lists and sort by age in ascending order using Stream API
        List<Employee> mergedAndSortedEmployees = Stream.concat(employees1.stream(), employees2.stream())
                .sorted(Comparator.comparingInt(Employee::getAge))
                .toList();

        //Print the merged and sorted employee list
        System.out.println("List 1: " + employees1);
        System.out.println("List 2: " + employees2);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Merged and Sorted Employee list: \n" + mergedAndSortedEmployees);
    }
}
