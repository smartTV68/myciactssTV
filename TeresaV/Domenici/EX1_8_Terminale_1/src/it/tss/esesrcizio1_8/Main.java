/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.esesrcizio1_8;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Main {
    public static void main(String[] args) {
        if (args.length !=1 ) {
            System.out.println("devi passare uin numero come parametro!!");
            System.exit(0);
        }
        
        int x = Integer.parseInt(args[0]);
        int n = 1;
        int sommaDivisori = 0;
        while (n < x) {
            if (x % n == 0) {
                // sommaDivisori= sommaDivisori + n;
                sommaDivisori += n;

            }
            // = n +1;
            // n += 1;
            n++; //serve per incrementare di uno

        }
        if (sommaDivisori == x) {
            System.out.println(x + " perfetto");
        } else if (sommaDivisori > x) {
            System.out.println(x + "abbondante");
        } else if (sommaDivisori < x) {
            System.out.println(x + " difettivo");
        }

    }

}
