/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oo_bj;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

                
        Mazzo mazzo = new Mazzo();
        System.out.println();
        
        for (int i=0; i<10;i++){
            Carta pescata = mazzo.pesca();
            System.out.println(pescata.toString());
        }
        
    }
    
}
