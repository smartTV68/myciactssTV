/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oo_dado_strut;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Giocatore g = new Giocatore(10,15,5);
        Dado dadoG = new Dado(6);
        Dado dadoB = new Dado(6);
        int conta = 1;
        do {
            dadoG.lancia();
            dadoB.lancia();
            stampaMano(conta,dadoG.getUltimoLancio(),dadoB.getUltimoLancio());
            if (dadoG.getUltimoLancio() > dadoB.getUltimoLancio()) {
                g.incrementaSoldi();
                stampaGiocatore(g.getSoldi());
            } else {
                g.decrementaSoldi();
                stampaGiocatore(g.getSoldi());
            }
            conta++;
        } while (g.isContinua());
    }

    private static void stampaMano(int conta, int lancioG, int lancioB) {
        String msg = String.format("mano numero %s banco=%s giocatore=%s",conta,lancioB,lancioG );
        System.out.println(msg);
    }

    private static void stampaGiocatore(int soldi) {
        System.out.println("soldi giocatore: " + soldi);
    }
}
