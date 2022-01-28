/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.ex_array;

import java.util.Random;

/**
 *
 * @author tss
 */
public class MainRicerca {
    public static void main(String[] args) {
        
// lam ricerca di un numero in un array prevede due parametri in ingresso
  //partiamo da un array       
  int[] input = generaArrayCasuale (10,10);
  ArraysTools.stampa(input);
  
  System.out.println("ricerca 5: " + ArraysTools.ricerca(input, 5));
        System.out.println("MAX: " + ArraysTools.max(input));
        System.out.println("MIN: " + ArraysTools.min(input));
        System.out.println("SOMMA: " + ArraysTools.somma(input));
        System.out.println("MEDIA: " + ArraysTools.media(input));
        ArraysTools.ordinaBubble(input);
        ArraysTools.stampa(input);
    }
/**
 * 
 * @param ncelle numero di celle nell'array
 * @param max numero massimo interio contenuto nell'array
 * @return 
 */
    static int[] generaArrayCasuale(int ncelle, int max) {
        int [] ris = new int[ncelle];
        for (int i = 0; i < ris.length; i++) {
            ris[i] = generaNumeroCasuale(max);
        }
        
        return ris;
    }

    static int generaNumeroCasuale(int max) {
        
        Random random = new Random();
        return random.nextInt(max);
    }
    
}
