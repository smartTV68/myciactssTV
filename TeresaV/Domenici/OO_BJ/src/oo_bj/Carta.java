/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oo_bj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author tss
 */
public class Carta {
    // seme può avere so0lo quattro valori costanti, cuori...
    //per definire un insieme fisso di quattro costanti
    //   private String [] semi = {"Cuori, Quadri, Fiori, Picche"}
    //  private int seme;

    public static enum Seme { //accessibile public tramite Carta.Seme.cuori
        CUORI, QUADRI, FIORI, PICCHE
    }

    public static enum Nome { //accessibile public tramite Carta.Seme.cuori
        ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO, NOVE, DIECI, FANTE, DONNA, RE
    }

    private final Seme seme;
    private final ArrayList<Integer> valoriPossibili;
    private int valore;
    private final Nome nome;
    //quando costruisco carta devo passare seme valore e valori possibili (per esempio asso)

    public Carta(Seme seme, int valore, Nome nome) {

        this(seme, valore, nome, new ArrayList());
    }

    public Carta(Seme seme, int valore, Nome nome, ArrayList<Integer> valori) {
        Objects.requireNonNull(seme, "Seme non può essere null");
        Objects.requireNonNull(nome, "Nome non può essere null");
        checkValore(valore);
        this.seme = seme;
        this.valore = valore;
        this.nome = nome;
        this.valoriPossibili = new ArrayList<>(valori);
        if (this.valoriPossibili.isEmpty()) {
            valoriPossibili.add(valore);
        }
    }

    private void checkValore(int valore){
        if (valore<=0 || valore>13){
            throw new IllegalArgumentException("Valore non valido");
        }
    }
    
    public Seme getSeme() {
        return seme;
    }

    public int getValore() {
        return valore;
    }

    public Nome getNome() {
        return nome;
    }

    public void setValore(int valore) {
        if (valoriPossibili.contains(valore)) {
            throw new IllegalArgumentException("Valore non previsto");
        }
        this.valore = valore;
    }
// sono io che dichiaro che carta è ricreando toString

    @Override
    public String toString() {

        return this.nome.name() +" di "+ this.seme.name() + this.valore;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.seme);
        hash = 83 * hash + this.valore;
        hash = 83 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carta other = (Carta) obj;
        if (this.valore != other.valore) {
            return false;
        }
        if (this.seme != other.seme) {
            return false;
        }
        return this.nome == other.nome;
    }

}
