/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.agenda_appuntamenti;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author tss
 */
public class Agenda {

    private final List<Appuntamento> appuntamenti = new ArrayList<>();

    public Agenda() {
    }

    public Appuntamento aggiungiAppuntamento(LocalDate data, LocalTime inizio, LocalTime fine, String luogo, String persona) throws AgendaException {
        //Gestione dei valori nulli
        Objects.requireNonNull(data);//la data deve essere messa
        inizio = Objects.requireNonNullElse(inizio, LocalTime.MIN);
        fine = Objects.requireNonNullElse(fine, LocalTime.MAX);
        if (data.isBefore(LocalDate.now())) {
            throw new AgendaException("Data appuntamento non valida");
        }
        Appuntamento result = new Appuntamento(data, inizio, fine, luogo, persona);
        boolean isInvalid = appuntamenti.stream().anyMatch(v -> v.invalid(result));
        if (isInvalid) {
            throw new AgendaException("Appuntamento non valido");

        }

        appuntamenti.add(result);
        return result;

    }

    public void cancellaAppuntamento(Appuntamento ap) {
        appuntamenti.remove(ap);

    }

    public void cancellaAppuntamento(LocalDate data, String luogo, String persona) {
        //creo una funzione lambda che prende predicate (funzione booleana)
        //appuntamenti.removeIf(v -> v.getData().equals(data));
        //appuntamenti.removeIf(v -> v.getData().equals(data));
        appuntamenti.removeAll(cerca(data, luogo, persona));
    }

    public List<Appuntamento> cerca(LocalDate data, String luogo, String persona) {
        //v variabile di ingresso dell'espressione lambda in qiuesto caso = appuntamento
        Predicate<Appuntamento> byDate = v -> data == null || v.getData().equals(data);
        Predicate<Appuntamento> byLuogo = v -> luogo == null || luogo.isBlank()
                || v.getLuogo().trim().toLowerCase().equals(luogo.trim().toLowerCase());
        Predicate<Appuntamento> byPersona = v -> persona == null || persona.isBlank()
                || v.getPersona().trim().toLowerCase().equals(persona.trim().toLowerCase());

        return appuntamenti.stream().filter(byDate.and(byLuogo).and(byPersona)).collect(Collectors.toList());

    }

    public void stampa() {
        System.out.println("-----------Agenda-----------");
        //creo una lambda expression che impelementa l'interfaccia fuinzioanel Consumer
        //appuntamenti.forEach(v ->System.out.println(v));
        // method reference
        //appuntamenti.forEach(System.out::println);
        appuntamenti.forEach(this::stampaAppuntamento);
    }

//anche noi possiamo crearci un Consumer
    private void stampaAppuntamento(Appuntamento a) {
        String frase = String.format("%s alle %s fino alle %s ad %s con %s",
                a.getData().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
                a.getOraInizio(), a.getOrafine(), a.getLuogo(), a.getPersona());
        System.out.println(frase);
    }
}
