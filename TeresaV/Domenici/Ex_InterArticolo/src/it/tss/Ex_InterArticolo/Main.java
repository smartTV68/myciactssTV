/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.Ex_InterArticolo;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Mobile ikea = new Mobile("Stokke", 20.00, 60, 100, 75);
        Mobile ikea1 = new Mobile("Strongold", 50.00, 100, 150, 80);
        Mobile ikea2 = new Mobile("Patato", 200.00, 200, 200, 90);
        Catalogo<Mobile> cat = new Catalogo();
        cat.aggiungiArticolo(ikea);
        cat.aggiungiArticolo(ikea1);
        cat.aggiungiArticolo(ikea2);
        
        cat.getArticoliSottoPrezzo(50.00);
        System.out.println(cat);

        ProvaMobile check = new ProvaMobile();
        check.scegliMobile(cat, 200, 200, 200, 100);
        System.out.println(cat);

    }

}
