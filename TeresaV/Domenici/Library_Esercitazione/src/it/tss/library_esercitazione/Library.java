/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.library_esercitazione;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author tss
 */
public class Library {

    private final Set<Book> libri = new LinkedHashSet<>();

    public Set<Book> getLibri() {
        return libri;
    }

    public boolean addBook(Book libro) {
        boolean presente = libri.contains(libro);
        if (presente) {
            return false;
        } else {
            libri.add(libro);
            return true;
        }
   
    }

    public boolean loanBook(Book libro) {
        boolean presente = libri.contains(libro);
        if (presente = true) {
            if (libro.isPrestato()) {
                libro.setPrestato(true);
                return true;
            } else if (!libro.isPrestato()) {
                System.out.println("Libro già dato in prestito");
                return false;
            } else {
                throw new IllegalArgumentException("Libro non presente");
            }
        }
        return false;
    }

    public boolean returnBook(Book libro) {
        boolean presente = libri.contains(libro);
        boolean restituito = false;
        if (restituito == presente) {
            libri.add(libro);
        } else {
            throw new IllegalArgumentException("Libro non della biblioteca");
        }
        return true;
        
    }


    
    
    
    
    
}
