/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.library_esercitazione;

/**
 *
 * @author tss
 */
public class Library_Esercitazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        

        Library lib = new Library();
        Book a = new Book("a"), b = new Book("b"), c = new Book("c");

        System.out.println(lib.addBook(a));
        System.out.println(lib.addBook(b));
        System.out.println(lib.addBook(c));
        System.out.println(lib.addBook(a));
        System.out.println(lib.loanBook(b));
        System.out.println(lib.loanBook(a));

    }

}
