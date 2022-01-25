/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lez03;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Main_G {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        pTx("ciao");
        pTx("tutto bene...");
        String nome = "Luca";

        float prezzo = chiediNumero("Inserisci il prezzo");
        float iva = chiediNumero("Inserisci l'Iva");
        float valore = scorporoIva(122, 22);
        String testo = "prezzo scorporato =" + valore;
        pTx(testo);

        /*int quanti = (int) chiediNumero("inserisci numero di righe dell'elenco: ");
        stampaNumeri(quanti);
        float prezzo = chiediNumero("inserisci prezzo prodotto: ");
        float sconto = chiediNumero("inserisci lo sconto da applicare [es 20 per 20%]: ");
        float scontato = scontaPrezzo(prezzo, sconto);
        System.out.println("Il prezzo scontato è: " + "€ " + scontato);
       
        int addendo1 = (int) chiediNumero("inserisci il primo addendo: ");
        int addendo2 = (int) chiediNumero("inserisci il secondo addendo: ");
        int somma = sommaValori(addendo1, addendo2);
        System.out.println("La somma è: " + somma);
       
        int dividendo = (int) chiediNumero("inserisci il dividendo: ");
        int divisore = (int) chiediNumero("inserisci il divisore: ");
        float risultatod;
        risultatod = divisioneNumeri(dividendo, divisore);
        stampaDivisione(risultatod);*/
    }

    static float scontaPrezzo(float prezzo, float sconto) {
        float ris = 0;
        /*
        100 e 20
        100*20/100 ---> 20 da togliere
        100 - 20 ----> 80 da restituire
        togliere = prezzo*sconto/100
        finale = prezzo - togliere
         */
        ris = prezzo - (prezzo * sconto / 100);
        return ris;
    }

    static int sommaValori(int valore1, int valore2) {
        int ris = 0;
        ris = valore1 + valore2;
        return ris;
    }

    static void stampaNumeri(int quanti) {
        for (int i = 1; i <= quanti; i++) {
            String inizio = "";
            if (i < 10) {
                inizio = "  ";
            } else if (i < 100) {
                inizio = " ";
            }
            String barra = ") ______________________________";

            String rigafinale = inizio + i + barra;

            System.out.println(rigafinale);

        }

    }//stampa una serie di numeri

    static float divisioneNumeri(float valore1, float valore2) {
        float ris = 0;
        if (valore2 == 0) {
            ris = -99999.99f;
        } else {
            ris = valore1 / valore2;
        }
        return ris;

    }

    static void stampaDivisione(float risultato) {
        if (risultato == -99999.99f) {
            System.out.println("La divisione è impossibile");
        } else {
            System.out.println("Il risultato della divisione è: " + risultato);
        }

    }

    private static float chiediNumero(String testodomanda) {
        float ris = 0;
        String txnumero = JOptionPane.showInputDialog(testodomanda);
        ris = Float.parseFloat(txnumero);
        return ris;

    }

    static void pTx(String testo) {
        System.out.println();
        System.out.println(testo);
    }

    static float scorporoIva(float prezzo, float iva) {
        float ris = 0;
        ris = (prezzo * 100) / (100 + iva);
        return ris;
    }

}
