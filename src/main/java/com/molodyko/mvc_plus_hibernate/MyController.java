package com.molodyko.mvc_plus_hibernate;


import com.molodyko.mvc_plus_hibernate.DAO.EmployeeDAO;
import com.molodyko.mvc_plus_hibernate.DAO.EmployeeDAOImpl;
import com.molodyko.mvc_plus_hibernate.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("showEmp")
    public String showDetail(Model model){
        List<Employee> employees = employeeDAO.getEmployees();
        model.addAttribute("empList",employees);
        return "showEmp";
    }


}
