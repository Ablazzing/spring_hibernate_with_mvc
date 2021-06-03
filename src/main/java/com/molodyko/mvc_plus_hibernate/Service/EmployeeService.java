package com.molodyko.mvc_plus_hibernate.Service;

import com.molodyko.mvc_plus_hibernate.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();

    public void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee getEmployee(int id);

    void delete(Employee employee);
}
