/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.tss.campionatorugby;

/**
 *
 * @author tss
 */
public class Partita {
    private int giornata;
    private String squadra1;
    private String squadra2;
    private int mete1;
    private int mete2;

    
    public Partita(int giornata, String squadra1, String squadra2, int metesq1, int metesq2) {
        this.giornata = giornata;
        this.squadra1 = squadra1;
        this.squadra2 = squadra2;
        this.mete1 = metesq1;
        this.mete2 = metesq2;
        
        
        
    }

    public int getGiornata() {
        return giornata;
    }

    public void setGiornata(int giornata) {
        this.giornata = giornata;
    }

    public String getSquadra1() {
        return squadra1;
    }

    public void setSquadra1(String squadra1) {
        this.squadra1 = squadra1;
    }

    public String getSquadra2() {
        return squadra2;
    }

    public void setSquadra2(String squadra2) {
        this.squadra2 = squadra2;
    }

    public int getMete1() {
        return mete1;
    }

       public int getMete2() {
        return mete2;
    }
    
 String getCSVPartita() {
        String file = giornata+";"+squadra1+";"+squadra2+";"+mete1+";"+mete2+"\n";
        return file;
    }

    String getInfoPartita() {
        String ris = "";
        ris +=  giornata+" - "+squadra1+" - "+squadra2+" - "+mete1+" - "+mete2+"\n";
        return ris;
    }   
            
    
}
