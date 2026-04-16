package jsontoxml.jsonxmlconversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jsontoxml.jsonxmlconversion.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
