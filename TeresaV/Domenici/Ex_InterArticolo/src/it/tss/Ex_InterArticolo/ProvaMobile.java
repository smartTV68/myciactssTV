/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.Ex_InterArticolo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author tss
 */
public class ProvaMobile {
    
  
/*Scrivere una classe ProvaMobile dotata di un metodo scegliMobile che riceve in ingresso un
catalogo di oggetti di tipo Mobile(o suoi sotto-tipi), un prezzo e tre dimensioni (larghezza,
altezza, profondità) e restituisce un lista di mobili il cui prezzo è inferiore al prezzo dato e le cui
dimensioni sono inferiori alle dimensioni date. */   
  public static List<Mobile> scegliMobile(Catalogo<Mobile> cat, double prezzo, int larghezza, int altezza, int profondita){
     
     Predicate <Mobile> byPrezzo = v -> v.getPrezzo()<(prezzo);
     Predicate <Mobile> byDimensioni = v -> v.getLarghezza()<(larghezza)&& v.getAltezza()<(altezza) && v.getProfondita()<(profondita);
 
     return cat.getArticoli().stream().filter(byPrezzo.and(byDimensioni)).collect(Collectors.toList());
  }
}
