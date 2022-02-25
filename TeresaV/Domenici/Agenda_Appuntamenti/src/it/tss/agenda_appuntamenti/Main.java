/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.agenda_appuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Agenda agenda = new Agenda();
        creaAppuntamento(agenda, LocalDate.now(), LocalTime.of(14, 30), LocalTime.of(15, 30), "Ivrea", "Alfonso");
        creaAppuntamento(agenda, LocalDate.now(), LocalTime.of(17, 30), LocalTime.of(18, 30), "Pont", "Perla");
        creaAppuntamento(agenda, LocalDate.now().plusDays(1), LocalTime.of(15, 30), LocalTime.of(16, 30), "Ivrea", "Paola");
        creaAppuntamento(agenda, LocalDate.now().plusDays(10), LocalTime.of(15, 30), LocalTime.of(16, 30), "Ivrea", "Paola");


        /*agenda.stampa();

        agenda.cancellaAppuntamento(LocalDate.now());
        agenda.stampa();*/
        System.out.println("Appuntamenti di Ivrea");
        agenda.cerca(null, "Ivrea", "").forEach(System.out::println);

    }

    private static Appuntamento creaAppuntamento(Agenda a, LocalDate data, LocalTime inizio, LocalTime fine, String luogo, String persona) {
        try {
            return a.aggiungiAppuntamento(data, inizio, fine, luogo, persona);
        } catch (AgendaException ex) {
            System.err.println(ex.getMessage());

        }
        return null;
    }
}
