/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package it.tss.prenotazioni_main;

import java.util.Collection;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Clinica c = new Clinica();
        c.prenota(Specialista.OCULISTA, "Pippo_Franco");
        c.prenota(Specialista.OCULISTA, "Leo_Gullotta");
        c.prenota(Specialista.OCULISTA, "Leo_Gullotta");
        c.prenota(Specialista.PEDIATRA, "Ciccio_Ingrassia");
        c.prenota(Specialista.PEDIATRA, "Leo_Gullotta");
        c.cancellaPrenotazione(Specialista.PEDIATRA, "Ciccio_Ingrassia");
        
        Collection<Prenotazioni> ocu=c.getPrenotati(Specialista.OCULISTA);
        System.out.println(ocu);
        System.out.println(c.getPrenotati(Specialista.PEDIATRA));
    }

}
