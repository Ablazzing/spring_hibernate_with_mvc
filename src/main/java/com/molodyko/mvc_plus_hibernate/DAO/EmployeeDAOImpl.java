package com.molodyko.mvc_plus_hibernate.DAO;

import com.molodyko.mvc_plus_hibernate.Entity.Employee;
import com.molodyko.mvc_plus_hibernate.Service.EmployeeService;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("from Employee",Employee.class).getResultList();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.save(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.update(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Employee.class,id);
    }

    @Override
    @Transactional
    public void delete(Employee employee) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(employee);
    }


}
