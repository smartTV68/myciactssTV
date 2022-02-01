/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionescuola;

/**
 *
 * @author tss
 */
public class Alunno {

    //parametri
    String cognome;
    String nome;
    String mail;
    String tel;

    //costruttori
    public Alunno(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    public Alunno(String cognome, String nome, String mail, String telefono) {
        this.cognome = cognome;
        this.nome = nome;
        this.mail = mail;
        this.tel = telefono;

    }

    Alunno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void stampaInfo() {

        System.out.println("\n\n----------Scheda Alunno----------");
        System.out.println("Cognome: " + cognome);
        System.out.println("Nome: " + nome);
        System.out.println("Mail: " + mail);
        System.out.println("Cellulare: " + tel);

    }

}
