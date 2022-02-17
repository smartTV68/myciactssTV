package gestionescuola;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author tss
 */
public class Corso {

    // area attributi o proprietà
    private String nomecorso;
    private String descrizione;
    private int durataore;
    private LocalDate datainizio;
    private String link = "https//www.ciaformazione.it";
//una struttura per caricare i possibili 30 alunni (registro)
    private ArrayList<Anagrafica> registro = new ArrayList<>();
// elenco alunni vuoto

    // costruttori
    public Corso() {
        nomecorso = "NN";
        durataore = 0;
        descrizione = "---";
        datainizio = LocalDate.now();
    }

    public Corso(String nomecorso, int durataore) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "---";
        datainizio = LocalDate.now();
    }

    public Corso(String nomecorso, int durataore, int y, int m, int d) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = "---";
        setDatainizio(y, m, d);
    }

    public Corso(String nomecorso, int durataore, String descrizione) {
        this.nomecorso = nomecorso;
        this.durataore = durataore;
        this.descrizione = descrizione;
        datainizio = LocalDate.now();
    }

    public String getNomecorso() {
        return nomecorso;
    }

    public void setNomecorso(String nomecorso) {
        if (nomecorso.length() > 0 && nomecorso.length() < 120);
        this.nomecorso = nomecorso;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getDurataore() {
        return durataore;
    }

    public void setDurataore(int durataore) {
        if (durataore > 0 && durataore < 6000);
        this.durataore = durataore;
    }

    public LocalDate getDatainizio() {
        return datainizio;
    }

    public void setDatainizio(LocalDate datainizio) {
        this.datainizio = datainizio;
    }

    /**
     * devo dirgli come voglio la data in un formato italiano o americano....
     * imposta la data da data testo
     *
     * @param datainizio formato YYYY-MM-DD 2022-02-02 (standard database)
     */
    public boolean setDatainizio(String datainizio) {
        try {
            int y, m, d;
            String parts[] = datainizio.split("-");
            y = Integer.parseInt(parts[0]);
            y = Integer.parseInt(parts[1]);
            y = Integer.parseInt(parts[2]);
            LocalDate data = LocalDate.of(2022, 02, 02);
            this.datainizio = data;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * imposto la data inizio dai 3 parametri numerici
     *
     * @param y int anno
     * @param m int mese
     * @param d int giorno
     * @return
     */
    public boolean setDatainizio(int y, int m, int d) {
        try {
            LocalDate data = LocalDate.of(y, m, d);
            this.datainizio = data;
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ArrayList<Anagrafica> getRegistro() {
        return registro;
    }

    public void setRegistro(ArrayList<Anagrafica> registro) {
        this.registro = registro;
    }

    // metodi o capacità o abilità
    //posso fare metodo che dica stampa informazioni
    void updateAlunno(Anagrafica alunno, int pos) {
        registro.set(pos, alunno);

    }

    boolean insertAlunno(Anagrafica alunno) {
        int ida = alunno.getId_anagrafica();
        for (Anagrafica al : registro) {
            if (al.getId_anagrafica() == ida) {
                return false;
            }
        }
        registro.add(alunno);
        return true;
    }

    /* void stampaRegistro() {
        for (Anagrafica al : registro) {
            al.stampaInfo();
        }
    }*/
    String stampaInfo() {
        String ris = "";
        ris += "----------Scheda Corso----------";
        ris += "\n Nome del Corso: " + nomecorso;
        ris += "\n Durata ore: " + durataore;
        ris += "\nDescrizione del Corso: " + descrizione;
        ris += "\nData inizio del Corso: " + datainizio.toString();
        ris += "\nLink Corso: " + link + "\n";

        return ris;
    }

    String getInfo() {
        String ris = "";
        ris += "----------Scheda Corso----------";
        ris += "\n Nome del Corso: " + nomecorso;
        ris += "\n Durata ore: " + durataore;
        ris += "\nDescrizione del Corso: " + descrizione;
        ris += "\nData inizio del Corso: " + datainizio.toString();
        ris += "\nLink Corso: " + link + "\n";

        return ris;
    }

    /**
     * ritorna un csv con i corsi testata nomecorso;durataore;descrizione;
     *
     * @return
     */
    String getCSV() {
        String ris = "";
        //le intestazioni di colonna che andranno però inserite in metodo salvaCorsi CSV
        //= "nomecorso;durataore;descrizione;datainizio;link;\n";
        String listaregistro = "";
        for (Anagrafica al : registro) {
            listaregistro += al.getId_anagrafica() + ",";
        }
        if (listaregistro.length() > 0) {
            listaregistro = listaregistro.substring(0, listaregistro.length()-1);
        }

        ris += nomecorso + ";" + durataore + ";" + descrizione + ";"
                + datainizio.toString() + ";" + link + ";" + listaregistro + "\n";

        return ris;
    }
    public boolean isAlunno (int id){
        for (Anagrafica a: registro){
            if (a.getId_anagrafica()==id)
                return true;
        }
        return false;
    }
}
