/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lez03;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Lez03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int myvoto = 0;
        /*    if (!(myvoto<0 || myvoto>10)) {
            System.out.println("Dati non validi");
            return;}*/
        String vototx = JOptionPane.showInputDialog("inserisci la media dei voti [0-10]");
        //converto in intero la stringa vototx
        boolean lode
                = vototx.equalsIgnoreCase("10 e lode")
                || vototx.equalsIgnoreCase("10 con lode")
                || vototx.equalsIgnoreCase("10 lode");
        if (!lode) {
            myvoto = Integer.parseInt(vototx);
        } else {
            myvoto = 10;
        }

        //non quelli buoni
        boolean outofrange = !(myvoto >= 0 && myvoto <= 10);
        // if (!(myvoto>=0 && myvoto<=10)) {
        if (outofrange) {
            System.out.println("Dati non validi");
            return;
        }
        // per essere ammesso almeno 5
        // se almeno 5 stampo ammesso, altrimenti stampo non ammesso
        if (myvoto >= 5) {
            System.out.println("Ammesso");

            // fascia pericolante dal 5 al 6 stampo Pericolante
            if (myvoto >= 5 && myvoto <= 6) {

                System.out.println("Pericolante");
            } else {
                if (myvoto >= 7 && myvoto <= 8) {
                    System.out.println("Discreto");
                } else {
                    System.out.println("Ottimo");
                }
                if (lode) {
                    System.out.println("Con Lode");
                }

            }

        } else {
            System.out.println("Non Ammesso");
        }

    }

}
