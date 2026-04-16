package jsontoxml.jsonxmlconversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jsontoxml.jsonxmlconversion.Employee;
import jsontoxml.jsonxmlconversion.Root;
import jsontoxml.jsonxmlconversion.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(consumes = {"application/json", "application/xml"})
    public Employee saveEmployee(@RequestBody Root root) {
        return employeeService.saveEmployee(root);
    }

    @GetMapping
    public java.util.List<Employee> getAllEmployees() {
        return employeeService.getAll();
    }
}
