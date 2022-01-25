    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.prova2;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Lez02Array {

    /**
     * @param args the command line arguments
     */
    /*   public static void main(String[] args) {
        // TODO code application logic here
        String[] generi = {"femmina", "maschio", "neutro", "trans", "questioning"};
        System.out.println(generi[0]);
        System.out.println(generi[3]);
        generi[3] = "transgender";
        System.out.println(generi[3]);

        System.out.println(generi.length);
        System.out.println(generi[generi.length - 1]);

        for (int i = 0; i < generi.length; i++) {

            System.out.println((i + 1) + ") " + generi[i]);
        }
    }

}*/
    public static void main(String[] args) {
        // prgramma che serve per caricare elenco di nomi
// inserisco array di testo che chiamo nomi
        String nomi[];
        int acconti[];
        // creo varibile numerica che darà dimensione dell'array
        int quanti;
        // creo Scanner per gestire input dell'utente
        Scanner lettoreS = new Scanner(System.in);
        Scanner lettoreI = new Scanner(System.in);
        System.out.println("Quanti nomi vuoi inserire in lista? ");
        //carico la dimensione della lista scelta dell'utente
        quanti = lettoreI.nextInt();
        //dimensiono la lista come da richiesta precedente
        nomi = new String[quanti];
        acconti = new int[quanti];


        for (int i = 0; i < nomi.length; i++) {
            String nome;
            System.out.println("inserisci nome [" + (i + 1) + "/" + nomi.length + "]  :");
            nome = lettoreS.nextLine();
            nomi[i] = nome;
            //gestione acconti
            int acconto;
            System.out.println("inserisci acconto:");
            acconto = lettoreI.nextInt();
            acconti[i] = acconto;
        }

        for (int i = 0; i < nomi.length; i++) {

            System.out.println((i + 1) + ") " + nomi[i] + " - " + acconti[i]);
        }
        // CHIEDO NOME DA CERCARE
        System.out.println("Scrivi il nome da cercare: ");
        String cerca = lettoreS.nextLine();
        
        boolean trovato=false;
        for (int i = 0; i < nomi.length; i++) {
            if (cerca.equalsIgnoreCase(nomi[i])) {
                trovato = true;
                break;
            }

        }
        
        if (trovato){
          System.out.println("Abbiamo Trovato: "+ cerca); 
        }
        else {
           System.out.println(cerca + " non presente"); 
        }
        
        int totale =0;
         for (int i = 0; i < nomi.length; i++) {
         totale += acconti[i];  
         }
       System.out.println("Totale versato: " + totale);
    }

}
