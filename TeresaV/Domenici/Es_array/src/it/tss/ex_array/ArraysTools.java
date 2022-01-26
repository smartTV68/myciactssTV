/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.ex_array;

/**
 *
 * @author tss
 */
public class ArraysTools {

    public static void stampa(int[] numeri) {
        int indice = 0;
        while (indice < numeri.length) {
            System.out.print(numeri[indice] + ",");
            indice = indice + 1;

        }
        /* for (int i = 0; i < numeri.length; i++) {
            System.out.print(numeri[i] + ",");
        }*/
        System.out.println("");
    }

    public static boolean ricerca(int[] numeri, int n) {
        boolean trovato = false;
        int indice = 0;
        while (indice < numeri.length && !trovato) {
            if (numeri[indice] == n) {

                trovato = true;
            }
            indice = indice + 1;
        }
        return trovato;
    }

    public static int max(int[] numeri, int n) {
         if (numeri ==null || numeri.length==0){
        throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
                  
         throw new UnsupportedOperationException("Non ancora implementato");
    }
    
    public static int min(int[] numeri) {
        if (numeri ==null || numeri.length==0){
        throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
        int min =numeri [0];
        int indice = 1;
        while (indice<numeri.length){
            if (numeri[indice]<min);
            min = numeri[indice];
        }
        return min;
        }
  
    public static int somma(int[] numeri) {
         if (numeri ==null || numeri.length==0){
        throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
         int ris =0;
         while (ris<numeri[indice]){
             
         }
        return ris;
    }
 
    
    
    
    public static int media(int[] numeri, int n) {
         if (numeri ==null || numeri.length==0){
        throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
        return (double) somma(numeri)/ numeri.length;
    }

    public static void ordina(int[] numeri, int n) {
         if (numeri ==null || numeri.length==0){
        throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
        

    }

}
