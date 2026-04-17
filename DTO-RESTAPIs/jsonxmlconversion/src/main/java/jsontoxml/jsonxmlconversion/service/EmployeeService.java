package jsontoxml.jsonxmlconversion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jsontoxml.jsonxmlconversion.Employee;
import jsontoxml.jsonxmlconversion.Root;
import jsontoxml.jsonxmlconversion.repository.EmployeeRepository;
// This is the service layer where we will write the business logic to save and retrieve employees from the database.
@Service
public class EmployeeService {

    @Autowired // Spring automatically connects database layer (Repository)
    private EmployeeRepository employeeRepository; // Service uses Repository to talk to database

    public Employee saveEmployee(Root root) {
        return employeeRepository.save(root.getEmployee()); // save the employee object to the database and return the saved employee object
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll(); // findAll() in JpaRepository to retrieve all records from the Employee table in the database and return them as a list
    }
}
