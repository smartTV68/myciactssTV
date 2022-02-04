/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oo_bank;

/**
 *
 * @author tss
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //supponiamo lavorare conti correnti e modellare un tipo di contocorrente
    ContoCorrenteConEstrattoConto cc=new ContoCorrenteConEstrattoConto("Rossi");
        cc.deposito(100);
        cc.prelievo(35);
        cc.deposito(50);
        cc.prelievo(20);
        cc.deposito(100);
        cc.prelievo(35);
        System.out.println("Estratto Conto " + cc.getMovimenti());
        System.out.println("Saldo " + cc.getSaldo());

    }

}
