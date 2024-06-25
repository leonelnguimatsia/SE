
/*****************************************************************
 * Autor: Leonel Nguimatsia                                      *
 * @version: IntelliJ2021 JDK16                                  *
 * Hochschule: TH-Kloen                                          *
 * Ort: Deutz Technische Hochschule                              *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de         *
 * Beschreibung: EntitaetKlasse Kunde                            *
 *                                                               *
 *****************************************************************/
package de.thk.se.prakt.kunden;

import java.util.ArrayList;

public class Kunde {

    private  String name;
    private ArrayList<Bestellung> bestellungenKunde;

    /**
     * Konstruktor ohne Parameter, Aber
     * Erzeugung einer ArrayList<Bestellung>
     * fuer BestellungenKunde
     */
    public Kunde(){

        bestellungenKunde = new ArrayList<Bestellung>();
    }

    /**
     * Konstruktion mit Parameter
     * @param name und Erzeugung einer ArrayList<Bestellung>
     * fuer BestellungenKunde
     */
    public Kunde(String name){

        bestellungenKunde = new ArrayList<Bestellung>();
        this.name = name;
    }

    /**
     * Getter Methode getBestellungenKunde()
     * @return bestellungenKunde
     */
    public ArrayList<Bestellung> getBestellungenKunde() {
        return bestellungenKunde;
    }

    /**
     * Getter Methode getName()
     * @return name
     */
    public String getName() {

        return name;
    }

    /**
     *  Setter Methode setBestellungKunde
      * @param bestellungenKunde
     */
    public void setBestellungenKunde(ArrayList<Bestellung> bestellungenKunde) {
        this.bestellungenKunde = bestellungenKunde;
    }

    /**
     * Setter Methode setName
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Methode KostenAllerBestellungen()
     * @return summePreis
     */
    public int kostenAllerBestellungen(){

      int summePreis = 0;

      for(int k =0; k<bestellungenKunde.size();k++){

          summePreis+= bestellungenKunde.get(k).getHaendler().getVersandKosten();

          summePreis+= bestellungenKunde.get(k).summePreisAllerArtikel();
       }

        return  summePreis;
    }

    /**
     * Methode AddBestellung zum Hinzufuegen eine
     * Bestellung fuer Kunden
     * @param einBestellungenKunde
     */
    public void addBestellung(Bestellung einBestellungenKunde){

        bestellungenKunde.add(einBestellungenKunde);
    }

    /**
     * Methode delBestellung zum Entfernen eine
     * Bestellung fuer Kunden
     * @param einBestellungenKunde
     */
    public void delBestellung(Bestellung einBestellungenKunde){

        bestellungenKunde.remove(einBestellungenKunde);
    }

}
