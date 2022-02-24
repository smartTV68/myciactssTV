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

    private List<Reservation> list = new ArrayList<>();

    public Reservation reserve(String nome, LocalDate inizio, LocalDate fine) {
        Reservation r = new Reservation(nome, inizio, fine);
        if (isOccupata(r)) {
            throw new IllegalArgumentException("periodo già occupato");
        }
        list.add(r);
        return r;

    }

    public List<Reservation> reservations() {
        // for (int i = 0; i < list.size(); i++) {
        Comparator<Reservation> comp = (r1, r2) -> r1.getInizio().compareTo(r2.getInizio());
        return this.list.stream().sorted(comp).collect(Collectors.toList());
    }

    private boolean isOccupata(Reservation nuova) {
        Predicate<Reservation> inizioNonValido = (r) ->
                !nuova.getInizio().isBefore(r.getInizio()) &&
                        !nuova.getFine().isAfter(r.getFine() || !nuova.getInizio().isBefore(r.getFine()) && nuova.getFine());
        
        
        
        for (Reservation r : list) {
            if (nuova.getInizio().equals(r.getInizio())
                    || (nuova.getInizio().isAfter(r.getInizio()) && nuova.getInizio().isBefore(r.getFine()))
                    || nuova.getFine().isAfter(r.getInizio()) && nuova.getFine().isBefore(r.getFine())) {
                return true;

            }
        }
        return false;
    }

}
