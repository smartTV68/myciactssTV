/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oo_dado_strut;

import java.util.Random;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int puntf = 10;
        int punt1=0 
        int dado2 = generaNumeroCasuale(6);
        int ris1= generaNumeroCasuale(6);
        int ris2= generaNumeroCasuale(6);
       
        while (dado1<puntf && dado2<puntf) {
            
        ris1++;
        ris2++;
        if (ris1>ris2) then
                dado1++;
                stampa mano vinta da dado1
        else if       
                dado2++
                stampa mano vinta da dado2
        else
                stampa mano patta
        end if
        end while
    if(dado1 ==punteggio) then 
        stampa partita vinte da dado1
    else
        stampa partita vinta da dado2
    end if
end

       
        (for i=0); i>puntfin;i++){
        
      
        int ris1= dado1.generaNumeroCasuale(6);
        ris1= ++;
        
    }
    
    }
    public static int generaNumeroCasuale(int x) {
        
        Random random = new Random();
        return random.nextInt(x);

    }
}