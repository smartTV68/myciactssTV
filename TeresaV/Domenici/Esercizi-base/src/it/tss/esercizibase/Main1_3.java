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
public class Main1_3 {

    public static void main(String[] args) {

        Scanner ins = new Scanner(System.in);
        // x = leggi dividendo;
        System.out.println("Inserisci il dividendo");
        int x = ins.nextInt();
        //y = leggi divisore;
        System.out.println("Inserisci il divisore");
        int y = ins.nextInt();

        int quoz = 0;
        int resto = 0;
        int calcola = x;   // calcola è la differenza tra x e y
        if (y != 0) {
            while (y <= calcola) {
                quoz = quoz + 1;
                calcola = calcola - y;
            }
            resto = calcola;
            System.out.println("Il quoziente è " + quoz);
            System.out.println("Il resto è " + resto);
        } else {
            System.out.println("impossibile calcolare la divisione per il numero 0");
        }
    }
}
