package com.project.ems.service;

import com.project.ems.domain.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(long id);

    public Employee saveEmployee(Employee employee);

    public Employee updateEmployee(long id, Employee employee);

    public void deleteEmployee(long id);
}
