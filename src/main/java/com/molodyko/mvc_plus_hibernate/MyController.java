package com.molodyko.mvc_plus_hibernate;


import com.molodyko.mvc_plus_hibernate.DAO.EmployeeDAO;
import com.molodyko.mvc_plus_hibernate.DAO.EmployeeDAOImpl;
import com.molodyko.mvc_plus_hibernate.Entity.Employee;
import com.molodyko.mvc_plus_hibernate.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MyController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("showEmp")
    public String showEmployees(Model model){
        List<Employee> employees = employeeService.getEmployees();
        model.addAttribute("empList",employees);
        return "showEmp";
    }

    @RequestMapping("addEmp")
    public String addEmployee(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);

        return "newEmp";
    }

    @RequestMapping("editEmp")
    public String editEmployee(@RequestParam String id, Model model){
        Employee employee = employeeService.getEmployee(Integer.parseInt(id));
        model.addAttribute("employee",employee);
        return "editEmp";
    }

    @RequestMapping("saveEmp")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.saveEmployee(employee);
        return "redirect:/showEmp";
    }

    @RequestMapping("updateEmp")
    public String updateEmp(@ModelAttribute("employee") Employee employee){
        employeeService.updateEmployee(employee);
        return "redirect:/showEmp";
    }

    @RequestMapping("deleteEmp")
    public String deleteEmployee(@RequestParam String id){
        Employee employee = employeeService.getEmployee(Integer.parseInt(id));
        employeeService.delete(employee);
        return "redirect:/showEmp";
    }

}
