/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodioverload;

import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class Tool {

    static float insNumero() {
        float risultato = 0;
        String txnumero = JOptionPane.showInputDialog("Inserisci numero");
        txnumero = txnumero.replaceAll(",", ".");
        try { //trappola di errore, tutto quello che è tra le prime graffe devi provare a farlo
            risultato = Float.parseFloat(txnumero); // traduce testo in numero
        } catch (Exception errore) { // fai un azione su errore ma non rompere il programma

            JOptionPane.showMessageDialog(null, "ERRORE assegnato 0\n" + errore.getMessage());
        }
        return risultato;
    }

    static float insNumero(String messaggio) {
        float risultato = 0; // dichiaro subito viariabile che deve tornare indietro
        //inseriamo concetto che fino a che non sei a posto non vai avanti
        boolean ok=false;
        //fino a che non è ok chiedo il numero
        do{
                 
        String txnumero = JOptionPane.showInputDialog(messaggio);
        txnumero = txnumero.replaceAll(",", ".");//ogni volta che trova la virgola lo trasforma con il punto nei numeri 
        try { //trappola di errore, tutto quello che è tra le prime graffe devi provare a farlo
            risultato = Float.parseFloat(txnumero); // traduce testo in numero
            ok = true;
        } catch (Exception errore) { // fai un azione su errore ma non rompere il programma

            JOptionPane.showMessageDialog(null, "ERRORE ritenta!!\n" + errore.getMessage());
        }
        }    while (!ok);
        return risultato;

    }

    static float insNumero(String messaggio, int numero_decimali) {
        float risultato = 0; // dichiaro subito viariabile che deve tornare indietro
        
        String txnumero = JOptionPane.showInputDialog(messaggio);
        txnumero = txnumero.replaceAll(",", ".");
        try { //trappola di errore, tutto quello che è tra le prime graffe devi provare a farlo
            risultato = Float.parseFloat(txnumero); // traduce testo in numero
        } catch (Exception errore) { // fai un azione su errore ma non rompere il programma

            JOptionPane.showMessageDialog(null, "ERRORE assegnato 0\n" + errore.getMessage());
        }
        // arrotondare a numero decimale due cifre devo m oltiplicare per 100 e dividere per 100 ma in realtà non sempre per 100
        // se mi da 0 devo moltiplicare per 1 se mi dicono 1 -> 10   2 -> 100   3 -< 1000
        float potenza = (float) Math.pow(10, numero_decimali);
        risultato = Math.round(risultato * potenza) / potenza;
        return risultato;

    }

    /**
     * metodo che serve per richiedere tramite messaggio un numero che verrà
     * arrotondato alla seconda cifra decimale
     *
     * @param messaggio
     * @return
     */
    static float insValuta(String messaggio) {
        return insNumero(messaggio, 2);
    }

    static String insGiorno(int day) {
        String giorno ="";
        switch (day) {
            case 1:
                giorno = "Lunedì";
                break;
            case 2:
                giorno = "Martedì";
                break;
            case 3:
                giorno = "Mercoledì";
                break;
            case 4:
                giorno = "Giovedì";
                break;
            case 5:
                giorno = "Venerdì";
                break;
            case 6:
                giorno = "Sabato";
                break;
            case 7:
                giorno = "Domenica";
                break;
            default:
                giorno = "Non esiste";
                
        }
        return giorno;
    }
    static float dist3D(float x, float y, float z){
        float ris=0;
        double calcolo = x*x+ y*y + z*z;
        calcolo= Math.sqrt(calcolo);
        ris = (float) calcolo;
        
        
        return ris;
    }
    /**
     * Carica dati random in array
     * @param ar array da caricare
     * @return array caricato di numeri random da 1 a 10
     */
    static int[] caricaNumeri(int[] ar){
        for(int i=0; i<ar.length;i++){
            ar[i]=(int) (Math.random()*10)+1; //aggiungo 1 per aumentare la probabilità che venga fuori il 10. genero numeri casuali da 1 a 10
        }
        
        return ar;
    }
     /**
     * Carica dati random in array
     * @param ar array da caricare
     * @param range valore massimo del dato da 1 a range
     * @return array caricato di numeri random da 1 a 10
     */
    static int[] caricaNumeriInt(int[] ar, int range){
        for(int i=0; i<ar.length;i++){
            double caso = Math.random();
            caso = caso*range;
            int valore = (int) caso;
            valore= valore +1;
            ar[i]= valore; 
           // ar[i]=(int) (Math.random()*range)+1; //aggiungo 1 per aumentare la probabilità che venga fuori il 10. genero numeri casuali da 1 a 10
        }
        
        return ar;
    }

    static int[] concatArrays(int[] ar1, int[] ar2) {
        int dim1 = ar1.length;
        int dim2 = ar2.length;
        int dimok =dim1+dim2;
        int[] arok = new int[dimok];
        // 0 con 0, 1 con 1, 2 con 2....
       for (int i=0; i<dim1; i++){
        arok[i]= ar1[i];
    }
       //inserimento secondo array da ultima posizione precedente
       //0 in 5, 1 in 6, 2 in 7
        for (int i=0; i<dim2; i++){
        arok[i+dim1]= ar2[i];
    }
        return arok;
    }

    static void stampaArrays(int[] arUnito) {
        int indice =0;
        while (indice< arUnito.length) {
            System.out.println(arUnito[indice] + ",");
            indice = indice +1;
        }
    }
    
    static int cercaVirus(int[] ar, int[] virus){
        int pos= -1; //se mi da posizione -1 non ha senso in un array quindi non trovato
        //controllo virus su prima posizione
        //eseguo enne controlli quanto è lungo il virus
        int vlen = virus.length;
        int numcontrolli= ar.length - vlen;
        
        for( int k=0; k<numcontrolli; k++){
           boolean okFound=true;
           // ciclo controllo sequenza
            for(int i=0; i<vlen;i++){
                if(virus[i]!=ar[i+k]){
                    okFound = false;
                    break;
                } //fine controllo virus in posizione
                
                if (okFound){//trovavirus
                    pos= k;
                    break;
                }
        }
        }
           
        return pos;
    
    
    }
}
