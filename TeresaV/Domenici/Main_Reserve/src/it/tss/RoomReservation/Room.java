/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.RoomReservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class Room {

    private final List<Reservation> prenotazioni = new ArrayList<>();

    public Reservation reserve(String nome, LocalDate inizio, LocalDate fine) {
        Reservation r = new Reservation(nome, inizio, fine);
        if (isOccupata(r)) {
            throw new IllegalArgumentException("periodo già occupato");
        }
        prenotazioni.add(r);
        return r;

    }

    public List<Reservation> reservations() {
        // for (int i = 0; i < list.size(); i++) {
        Comparator<Reservation> comp = (r1, r2) -> r1.getInizio().compareTo(r2.getInizio());
        return this.prenotazioni.stream().sorted(comp).collect(Collectors.toList());
    }

     private boolean isOccupata(Reservation nuova) {
        Predicate<Reservation> inizioNonValido = (r)
                -> !nuova.getInizio().isBefore(r.getInizio()) && !nuova.getInizio().isAfter(r.getFine());
        Predicate<Reservation> fineNonValida = (r)
                -> !nuova.getFine().isBefore(r.getInizio()) && !nuova.getFine().isAfter(r.getFine());
        Predicate<Reservation> tuttoNonValido = (r)
                -> nuova.getInizio().isBefore(r.getInizio()) && nuova.getFine().isAfter(r.getFine());
        return prenotazioni.stream().anyMatch(inizioNonValido.or(fineNonValida).or(tuttoNonValido));
    }

    
}
