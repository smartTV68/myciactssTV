 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.jpa;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dbscuola");
        EntityManager em = emf.createEntityManager();
        
       /* em.createQuery("select e from Corso e", Corso.class)
                .getResultList()
                .forEach(System.out::println);
        
       /* Corso tosave = new Corso();
        tosave.setTitolo("Jakarta EE");
        tosave.setDatainizio(LocalDate.now());
        tosave.setCosto(BigDecimal.valueOf(120,50));
        tosave.setDurata(120);
        tosave.setDescrizione("applicazioni web con Jakarta EE");
        tosave.setData_creazione(LocalDate.now());
        
        em.getTransaction().begin();
        
        em.persist(tosave);
        
        em.getTransaction().commit();*/
        
        em.createQuery("select e from Iscrizione e order by e.il DESC", Iscrizione.class)
                .getResultList()
                .forEach(System.out::println);
    }
        

}
