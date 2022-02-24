/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.RoomReservation;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Reservation {
    
    private String nome;
    private LocalDate inizio;
    private LocalDate fine;

    public Reservation(String nome, LocalDate inizio, LocalDate fine) {
        this.nome = nome;
        this.inizio = inizio;
        this.fine = fine;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getInizio() {
        return inizio;
    }

    public LocalDate getFine() {
        return fine;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nome);
        hash = 17 * hash + Objects.hashCode(this.inizio);
        hash = 17 * hash + Objects.hashCode(this.fine);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reservation other = (Reservation) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.inizio, other.inizio)) {
            return false;
        }
        if (!Objects.equals(this.fine, other.fine)) {
            return false;
        }
        return true;
    }

    
    

}
