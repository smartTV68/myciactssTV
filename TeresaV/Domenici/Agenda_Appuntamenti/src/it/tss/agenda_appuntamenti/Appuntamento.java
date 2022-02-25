/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.agenda_appuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Appuntamento {

    private LocalDate data;
    private LocalTime oraInizio;
    private LocalTime orafine;
    private String luogo;
    private String persona;

    public Appuntamento(LocalDate data, LocalTime oraInizio, LocalTime orafine, String luogo, String persona) {
        this.data = data;
        this.oraInizio = oraInizio;
        this.orafine = orafine;
        this.luogo = luogo;
        this.persona = persona;
    }

    public boolean intersect(Appuntamento nuovo) {
        if (!this.data.equals(nuovo.getData())) {
            return false;
        }
        if (this.isAllDay() || nuovo.isAllDay()) {
            return true;
        }// so che hanno data uguale am non sono tutto il giorno
        if (this.oraInizio.isBefore(nuovo.getOraInizio())
                || this.orafine.isAfter(nuovo.getOraInizio())) {
            return true;
        }
         return this.oraInizio.isBefore(nuovo.getOrafine())
                || this.orafine.isAfter(nuovo.getOrafine());
    }
    public boolean overlap(Appuntamento nuovo) {
        return nuovo.oraInizio.isBefore(this.oraInizio) && nuovo.orafine.isAfter(this.orafine);
    }

    public boolean isAllDay() {
        return oraInizio == LocalTime.MIN && orafine == LocalTime.MAX;
    }

    public boolean invalid(Appuntamento a) {

        return intersect(a) || overlap(a);
    }

    public LocalDate getData() {
        return data;
    }

    public LocalTime getOraInizio() {
        return oraInizio;
    }

    public LocalTime getOrafine() {
        return orafine;
    }

    public String getLuogo() {
        return luogo;
    }

    public String getPersona() {
        return persona;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.data);
        hash = 29 * hash + Objects.hashCode(this.oraInizio);
        hash = 29 * hash + Objects.hashCode(this.orafine);
        hash = 29 * hash + Objects.hashCode(this.luogo);
        hash = 29 * hash + Objects.hashCode(this.persona);
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
        final Appuntamento other = (Appuntamento) obj;
        if (!Objects.equals(this.luogo, other.luogo)) {
            return false;
        }
        if (!Objects.equals(this.persona, other.persona)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.oraInizio, other.oraInizio)) {
            return false;
        }
        return Objects.equals(this.orafine, other.orafine);
    }

    @Override
    public String toString() {
        return "Appuntamento{" + "data=" + data + ", oraInizio=" + oraInizio + ", orafine=" + orafine + ", luogo=" + luogo + ", persona=" + persona + '}';
    }

}
