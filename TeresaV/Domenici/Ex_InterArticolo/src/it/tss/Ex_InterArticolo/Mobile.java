/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.Ex_InterArticolo;

/**
 *
 * @author tss
 */
public class Mobile implements Articolo {

    private String nome;
    private double prezzo;
    private int larghezza;
    private int altezza;
    private int profondita;

    public Mobile(String nome, double prezzo, int larghezza, int altezza, int profondita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;

    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondita() {
        return profondita;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        String ris = "";
        ris += "------Mobile------\n";
        ris += "Nome= " + nome + " ;\n";
        ris += "Prezzo= " + prezzo + " ;\n";
        ris += "Larghezza= " + larghezza + " ;\n";
        ris += "Altezza= " + altezza + " ;\n";
        ris += "Profondità= " + profondita + "\n";

        return ris;
    }

}
