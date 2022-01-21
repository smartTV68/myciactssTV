package it.tss.esercizibase;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author tss
 */
public class Main1_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner lett = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int x = lett.nextInt();
        System.out.println("Inserisci il secondo numero");
        int y = lett.nextInt();

        int somma = 0;
        int contatore = 1;
        while (contatore <= y) {
            contatore = contatore + 1;
            somma = somma + x;
        }

        System.out.println("Il risultato è " + somma);
    }

}
