/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionescuola;

/**
 *
 * @author tss
 */
public class GestioneScuola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tool genio = new Tool();

        String nome = "Tss Java";
        int durata = 1000;
        Corso c1 = new Corso(nome, durata);
        c1.stampaInfo();
        Corso c2 = new Corso();
        c2.stampaInfo();

        Alunno a1 = new Alunno("Rossi", "Paolo");
        String oktel = genio.checkTel(" 0125 - 454545 ");
        Alunno a2 = new Alunno("Bruno", "Orso", "ccc@hhh", oktel);
        String oktel2 = genio.checkTel(" 0125/45.45.45", "+44");
        Alunno a3 = new Alunno("Babbo", "Nando", "ccc@hhh", oktel2);

        a1.stampaInfo();
        a2.stampaInfo();
        Alunno[] alunniRegistro = new Alunno[30];
        alunniRegistro[0] = a1;
        alunniRegistro[1] = a2;
        int i = 0;
        c1.insertAlunno(a1);
        c1.insertAlunno(a2);
        c1.stampaRegistro();

    }

}
