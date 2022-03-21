/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.prenotazioni_main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class Clinica {

    List<Prenotazioni> prenotazioni = new ArrayList<>();

    public Clinica() {
    }

    public void prenota(Specialista specialista, String paziente) {
        Prenotazioni nuovapr = new Prenotazioni(specialista, paziente);
        for (Prenotazioni pre : prenotazioni) {
            if (nuovapr.getPaziente().equals(pre.getPaziente())) {
                System.out.println("Non è possibile prenotare due specialisti");
                return;
            }

        }
        prenotazioni.add(nuovapr);

    }

    public void cancellaPrenotazione(Prenotazioni pr) {
        prenotazioni.remove(pr);
    }

    public void cancellaPrenotazione(Specialista specialista, String paziente) {

        Prenotazioni nuovapr = new Prenotazioni(specialista, paziente);
        prenotazioni.removeIf(v -> v.getPaziente().equals(nuovapr));
    }

     public List<Prenotazioni> getPrenotati(Specialista specialista) {

        Predicate<Prenotazioni> bySpecialista = v -> /*specialista == null || */ v.getSpecialista().equals(specialista);

        return prenotazioni.stream().filter(bySpecialista).collect(Collectors.toList());
    }

}
