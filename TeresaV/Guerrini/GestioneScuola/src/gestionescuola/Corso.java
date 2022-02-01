/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionescuola;

import java.util.Date;

/**
 *
 * @author tss
 */
public class Corso {

    // area attributi o proprietà
    String nomecorso;
    String descrizione;
    int durataore;
    Date datainizio;
    String link = "https//www.ciaformazione.it";
//una struttura per caricare i possibili 30 alunni (registro)

    Alunno[] registro = new Alunno[30];
// elenco alunni vuoto

    // costruttori
    public Corso() {
        nomecorso = "NN";
        durataore = 0;
        descrizione = "---";
        datainizio = new Date();
    }

    public Corso(String nomecorso, int durataore) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "---";
        datainizio = new Date();
    }

    public Corso(String nomecorso, int durataore, String descrizione) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = descrizione;
        datainizio = new Date();

    }

    // metodi o capacità o abilità
    //posso fare metodo che dica stampa informazioni
    void insertAlunno(Alunno alunno, int pos) {
        registro[pos] = alunno;

    }

    void insertAlunno(Alunno alunno) {
        int pos = 0;

        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null) {
                pos = i;
                break;
            }
        }

        registro[pos] = alunno;

    }

    void stampaRegistro() {

        for (int i = 0; i < registro.length; i++) {
            if (registro[i] == null) {
                break;
            } else {
                registro[i].stampaInfo();
            }
        }

    }

    void stampaInfo() {

        System.out.println("\n\n----------Scheda Corso----------");
        System.out.println("Nome del Corso: " + nomecorso);
        System.out.println("Durata ore: " + durataore);
        System.out.println("Descrizione del Corso: " + descrizione);
        System.out.println("Data inizio del Corso: " + datainizio.toString());
        System.out.println("Link Corso: " + link);
        System.out.println("\n\n-------------------------\n\n");

    }

}
