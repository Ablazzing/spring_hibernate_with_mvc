package com.molodyko.mvc_plus_hibernate.DAO;

import com.molodyko.mvc_plus_hibernate.Entity.Employee;
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
}
