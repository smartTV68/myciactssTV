/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.esercizio1_8;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inserisci il numero da analizzare");
        int x = sc.nextInt();
        String ris = analizza(x);
        System.out.println(x + " è " + ris);

    }

    public static String analizza(int x) {
        String risultato;
        int n = 1;
        int sommaDivisori = 0;
        while (n < x) {
            if (x % n == 0) {
                // sommaDivisori= sommaDivisori + n;
                sommaDivisori += n;

            }

            n++;

        }
        if (sommaDivisori == x) {
            risultato = " perfetto";
        } else if (sommaDivisori > x) {
            risultato = "abbondante";
        } else {
            risultato = " difettivo";
        }
        return risultato;
    }

}
