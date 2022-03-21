/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.prenotazioni_main;

import java.util.Objects;

/**
 *
 * @author tss
 */
public class Prenotazioni {
    Specialista specialista;
    String paziente;

    public Prenotazioni(Specialista specialista, String paziente) {
        this.specialista = specialista;
        this.paziente = paziente;
    }

    public Specialista getSpecialista() {
        return specialista;
    }

    public String getPaziente() {
        return paziente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.specialista);
        hash = 83 * hash + Objects.hashCode(this.paziente);
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
        final Prenotazioni other = (Prenotazioni) obj;
        return true;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "Specialista: " + specialista + "\n";
        ris += "Paziente: " + paziente + "\n";
        return ris;
    }
    
    
    
}
