package jsontoxml.jsonxmlconversion.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jsontoxml.jsonxmlconversion.Employee;
import jsontoxml.jsonxmlconversion.Root;
import jsontoxml.jsonxmlconversion.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Root root) {
        return employeeRepository.save(root.getEmployee());
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
