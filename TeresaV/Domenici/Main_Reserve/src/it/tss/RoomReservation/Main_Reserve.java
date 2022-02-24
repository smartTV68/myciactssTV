/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.RoomReservation;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author tss
 */
public class Main_Reserve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Room r = new Room();
        r.reserve("alfonso", LocalDate.of(2022, Month.MARCH, 15), LocalDate.of(2022, Month.MARCH, 30));
        r.reserve("mario", LocalDate.of(2022, Month.MAY, 15), LocalDate.of(2022, Month.MAY, 30));
        r.reserve("giovanna", LocalDate.of(2022, Month.FEBRUARY, 25), LocalDate.of(2022, Month.MARCH, 14));
       
        
        // caso 1 non funziona se inizio = fine
       r.reserve("PAOLA", LocalDate.of(2022, Month.MAY, 30), LocalDate.of(2022, Month.JUNE, 14));
        
         // caso 2 non funziona se fine = inizio
        r.reserve("PAOLA", LocalDate.of(2022, Month.JANUARY, 30), LocalDate.of(2022, Month.FEBRUARY, 25));
        
         // caso 3 non funziona se inizio = fine
        //r.reserve("PAOLA", LocalDate.of(2022, Month.MAY, 10), LocalDate.of(2022, Month.MAY, 31));
         
        r.reservations().forEach(v -> System.out.println(v));
        
    }

}
