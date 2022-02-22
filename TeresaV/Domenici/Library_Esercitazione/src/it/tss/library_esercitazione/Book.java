/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.library_esercitazione;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Book {
    private String titolo;
    private boolean prestato= false;
    private LocalDateTime data;

    public Book(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public boolean isPrestato() {
        return prestato;
    }

    public void setPrestato(boolean prestato) {
        this.prestato = prestato;
    }

    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.titolo);
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
        final Book other = (Book) obj;
        if (!Objects.equals(this.titolo, other.titolo)) {
            return false;
        }
        return true;
    }

   
    
    
    
}
