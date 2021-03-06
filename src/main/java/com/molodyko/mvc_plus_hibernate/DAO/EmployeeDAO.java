package com.molodyko.mvc_plus_hibernate.DAO;

import com.molodyko.mvc_plus_hibernate.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployees();

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    Employee getEmployee(int id);

    void delete(Employee employee);


}
