package jsontoxml.jsonxmlconversion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jsontoxml.jsonxmlconversion.Employee;
import jsontoxml.jsonxmlconversion.Root;
import jsontoxml.jsonxmlconversion.service.EmployeeService;

@RestController // this annotation is used to create a RESTful web service using Spring MVC.
@RequestMapping("/employee")// APIs start with /employee and then we can add more endpoints like /employee/save etc.
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService; // Controller uses Service to talk to business logic layer

    // consumes-- what type of data we are sending to the API -- both json and xml supported in our case
    @PostMapping(consumes = {"application/json", "application/xml"}) // add employee -- both json and xml supported
    public Employee saveEmployee(@RequestBody Root root) { // sends this data { "name": "John","id": 1} this is the json format 
    // and this is converts into java object @RequestBody Root root -- this is the java object format
        return employeeService.saveEmployee(root); // return the saved employee object
    }

    @GetMapping
    public List<Employee> getAllEmployees() { // Show me all employees in the database
        return employeeService.getAll();   // shows all the employees in the database
    }
}
