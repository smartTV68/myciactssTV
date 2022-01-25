/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.prova1;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Lez01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        String msg = "Buongiorno tss";
        int numero_msg = 12;
        float temperature = 12.5f;
        String txt = msg + " - " + numero_msg;
        
        
   System.out.println (txt);    
   System.out.println("ciao");
   
   Scanner reader = new Scanner(System.in);
   
   txt = reader.nextLine();
         */

 /*    // variabili per gestire input dati
        int num01;
        int num02;
        // chiedo i dati faccio domanda e aspetto risposta
        // creo lettore scanner
        Scanner lettore = new Scanner (System.in);
        //faccio domanda
        System.out.println("dimmi il primo numero: ");
        // aspetto risposta e la carico in num01
        num01 = lettore.nextInt();
         System.out.println("dimmi il secondo numero: ");
        // aspetto risposta e la carico in num02
        num02 = lettore.nextInt();
                lettore.close();
        //eseguo i calcoli e li metto da parte
        int ris;
        ris = num01 + num02;
        
       //abbiamo finito e faccio vedere il risultato
       
        String msg_risultato = "la somma è: " + ris;
        
        System.out.println (msg_risultato);
        
        msg_risultato = "i numeri erano: " + num01 + " - " + num02;
        System.out.println (msg_risultato);*/
        int costo01;
        int costo02;
        int saldo;
        // creo i contenitori delle mie variabili

        Scanner lettore = new Scanner(System.in);
        // creo la modalità input (che ho chiamato lettore) per le mie variabili

        System.out.println("dimmi il primo prezzo: ");
        //Faccio domanda 
        costo01 = lettore.nextInt();
        // carico primo prezzo

        System.out.println("dimmi il secondo prezzo: ");
        costo02 = lettore.nextInt();

        System.out.println("dimmi il tuo saldo: ");
        saldo = lettore.nextInt();
        lettore.close();
        // chiudo possibilità di input (lettore) perchè ho i dati che mi servono

//eseguo i calcoli
        int somma;
        somma = costo01 + costo02;

        //abbiamo finito e faccio vedere il risultato
        String msg_risultato = "Il totale è: €" + somma;

        System.out.println(msg_risultato);

        msg_risultato = "i costi erano: " + costo01 + " - " + costo02;
        System.out.println(msg_risultato);

        if (somma <= saldo) {
            int resto = saldo - somma;

            msg_risultato = "Compra!!!!";
            msg_risultato = msg_risultato + "\n";
            msg_risultato = msg_risultato + "ti rimangono: ";
            msg_risultato = msg_risultato + resto;
            msg_risultato = msg_risultato + "€";

            System.out.println(msg_risultato);
        } else {
            int mancano = somma - saldo;

            msg_risultato = "Non comprare";
            msg_risultato = msg_risultato + "\n";
            msg_risultato = msg_risultato + "ti mancano: ";
            msg_risultato = msg_risultato + mancano;
            msg_risultato = msg_risultato + "€";

            System.out.println(msg_risultato);
        }

    }

}
