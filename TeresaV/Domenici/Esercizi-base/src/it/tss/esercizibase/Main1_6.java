/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.esercizibase;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Main1_6 {

    public static void main(String[] args) {
        /*x = leggi numero;
somma = 0
while (x !=0) do
	somma = somma + x;
x = leggi numero;
end while
Stampa “la somma è:  + somma;
         */

        Scanner lettore = new Scanner(System.in);
         int x = 1;
        int somma = 0;
        while (x != 0) {
            System.out.println("Inserisci un numero");
            x = lettore.nextInt();
            somma = somma + x;
            
        }
        System.out.println("La somma è " + somma);
    }

}
