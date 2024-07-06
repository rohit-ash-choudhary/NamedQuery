package com.sp.main.NamedQuery;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import com.sp.entity.Employee;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager em = emf.createEntityManager();
        
        try {
            List<Employee> employees = em.createNamedQuery("Allemployeedetails", Employee.class).getResultList();
            for (Employee e : employees) {
                System.out.println(e.getEmployee_firstname() + " " + e.getEmployee_lastname());
            }
        } finally {
            em.close();
            emf.close();
        }
    }
}
