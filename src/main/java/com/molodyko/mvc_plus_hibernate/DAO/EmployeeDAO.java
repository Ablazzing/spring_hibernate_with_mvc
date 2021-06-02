package com.molodyko.mvc_plus_hibernate.DAO;

import com.molodyko.mvc_plus_hibernate.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getEmployees();
}
