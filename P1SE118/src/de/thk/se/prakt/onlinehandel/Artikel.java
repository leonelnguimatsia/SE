
/*****************************************************************
 * Autor: Leonel Nguimatsia                                      *
 * @version: IntelliJ2021 JDK16                                  *
 * Hochschule: TH-Kloen                                          *
 * Ort: Deutz Technische Hochschule                              *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de         *
 * Beschreibung: EntitaetKlasse Artikel                          *
 *                                                               *
 *****************************************************************/
package de.thk.se.prakt.onlinehandel;

import de.thk.se.prakt.kunden.Bestellung;

import java.util.ArrayList;

public class Artikel {


    private int preis;
    private String bezeichnung;
    private ArrayList<Bestellung> bestellungen;


    /**
     * Konstruktor ohne Parameter, Aber
     * Erzeugung einer ArrayList<Bestellung>
     * fuer Bestellungen
     */
    public Artikel(){

        bestellungen = new ArrayList<Bestellung>();
    }


    /**
     * Konstruktor mit Parameter und
     * Erzeugung einer ArrayList<Bestellung>
     * fuer Bestellungen
     * @param preis
     * @param bezeichnung
     */
    public Artikel(String bezeichnung, int preis) {

        bestellungen = new ArrayList<Bestellung>();
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    /**
     * Getter Methode getBestellungen
     * @return bestellungen
     */
    public ArrayList<Bestellung> getBestellungen() {
        return bestellungen;
    }
    /**
     * Getter Methode getBezeichnung
     * @return bezeichnung
     */
    public String getBezeichnung() {
        return bezeichnung;
    }

    /**
     * Getter Methode getPreis
     * @return preis
     */
    public int getPreis() {
        return preis;
    }

    /**
     * Setter Methode setBestellungen
     * @param bestellungen
     */
    public void setBestellungen(ArrayList<Bestellung> bestellungen) {
        this.bestellungen = bestellungen;
    }

    /**
     * Setter Methode setBezeichnung
     * @param bezeichnung
     */
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    /**
     * Setter Methode setPreis
     * @param preis
     */
    public void setPreis(int preis) {
        this.preis = preis;
    }

    /**
     * Methode addBestellungen zum Hinzufuegen eine
     * Bestellung fuer Kunde
     * @param eineBestellung
     */
    public void addBestellungen(Bestellung eineBestellung){

        bestellungen.add(eineBestellung);
    }

    /**
     * Methode delBestellungen zum Entfernen eine
     * Bestellung fuer Kunde
     * @param eineBestellung
     */
    public void delBestellungen(Bestellung eineBestellung){

        bestellungen.remove(eineBestellung);
    }

    /**
     * Methode artikelInformationen()
     * Ohne RueckgabeWert
     */
    public void artikelInformationen(){

        System.out.println("Bezeichnung: "+getBezeichnung()+" ,Preis: "+getPreis()+"€");
    }

}
