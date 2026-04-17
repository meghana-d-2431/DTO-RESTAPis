package jsontoxml.jsonxmlconversion.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jsontoxml.jsonxmlconversion.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> { // This repository represents the Employee table, and its ID is Long type.
}
// JpaRepository provides built-in methods like save(), findAll(), findById(), delete(), etc. to perform CRUD operations on the Employee table in the database.