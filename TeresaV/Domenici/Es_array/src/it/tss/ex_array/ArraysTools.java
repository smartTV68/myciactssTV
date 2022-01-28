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
public class ArraysTools {
    
    
    public static int[] generaArrayCasuale(int ncelle, int max) {
        int [] ris = new int[ncelle];
        for (int i = 0; i < ris.length; i++) {
            ris[i] = generaNumeroCasuale(max);
        }
        
        return ris;
    }

    public static int generaNumeroCasuale(int max) {
        
        Random random = new Random();
        return random.nextInt(max);
    }

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
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }

        throw new UnsupportedOperationException("Non ancora implementato");
    }

    public static int min(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
        int min = numeri[0];
        int indice = 1;
        while (indice < numeri.length) {
            if (numeri[indice] < min);
            min = numeri[indice];
        }
        return min;
    }

    public static int intersezione(int[] numeri1, int[] numeri2) {
        //prima devo contare gli elementi comuni ai due array e poi creo nuovo array in cui scrivo i numeri in comune
        int[] ris;
        for (int i = 0; i < numeri.length; i++) {

        }
        return ris
    

    

    

    :
    }
    
    public static boolean contieneValori(int[] numeri1, int[] numeri2) {
        //deve ritornare vero se numeri 2 contiene tutti i valori di numeri 1
        boolean ris = true;

        for (int n : numeri2) {
            if (ricerca(numeri1, n) == false) {
                ris = false;
                break;
            }
        }
        return ris;
    }
    
    
    public static boolean contieneSequenza(int[] numeri1, int[] numeri2){
        if(numeri2.length==0){
            return false;
        }
        if(numeri2.length>numeri1.length){
            return false;
        }
        
        boolean ris = false;
        int n = numeri2[0];
        int start = indexOf(numeri1, n);
        while (start != -1 && numeri1.length>=start + numeri2.length && !ris){
            ris = true;
            for(int i=0; i<numeri2.length; i++){
                if(numeri1[start+i] != numeri2[i]){
                    break;
                }
            }
            start = indexOf(start + 1, numeri1, n);
        }
        return ris;
        
    }

    /**
     * ritorna l'indice dell'elemento trovato altrimenti -1
     *
     */
    public static int indexOf(int[] numeri, int n) {
        return indexOf(0, numeri, n); 
    }
    /**
     * ritorna l'indice dell'elemento trovato altrimenti -1
     * @param start indice dal quale pertire nella ricerca
     * @param numeri
     * @param n
     * @return 
     */

    public static int indexOf(int start, int[] numeri, int n) {
        for (int i = start; i < numeri.length; i++) {
            if (numeri[i] == n) {
                return i;
            }
            return -1;
        }
    }
    public static contiene se

    public static int somma(int[] numeri) {
        if (numeri == null || numeri.length == 0) {
            throw new IllegalArgumentException("Impossibile calcolare il minimo");
        }
        int ris = 0;

    }
    return ris ;
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
        

public static int[] copia(int[] numeri) {
        int [] ris = new int[numeri.length];
        for (int i=0; i<ris.legth;i++){
        tmp =i<numeri1length ? numeri1 : numeri2;
        }
    }
return ris;
    }


  public static int[] unisci(int[] numeri1, int[] numeri2) {
int arUnito[] = numeri1.length + numeri2.length;
        for(int i=0 ; i< arUnito.length; i++){



}

}
