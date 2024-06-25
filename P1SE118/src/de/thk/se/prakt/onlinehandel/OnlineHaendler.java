
/*****************************************************************
 * Autor: Leonel Nguimatsia                                      *
 * @version: IntelliJ2021 JDK16                                  *
 * Hochschule: TH-Kloen                                          *
 * Ort: Deutz Technische Hochschule                              *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de         *
 * Beschreibung: EntitaetKlasse OnlineHaendler                   *
 *                                                               *
 *****************************************************************/
package de.thk.se.prakt.onlinehandel;

import de.thk.se.prakt.kunden.Bestellung;

import java.util.ArrayList;

public class OnlineHaendler {

    private String name;
    private String anschrift;
    private  int versandKosten;
    private ArrayList<Bestellung> bestellungenHaendler;

    /**
     * Konstruktor ohne Parameter, Aber
     * Erzeugung einer ArrayList<Bestellung>
     * fuer BestellungenHaendler
     */
    public OnlineHaendler(){

        bestellungenHaendler = new ArrayList<Bestellung>();
    }

    /**
     * Konstruktor mit Parameter
     * Erzeugung einer ArrayList<Bestellung>
     * fuer BestellungenHaendler
     * @param name
     * @param anschrift
     * @param versandKosten
     */
    public OnlineHaendler(String name, String anschrift,int versandKosten){

        bestellungenHaendler = new ArrayList<Bestellung>();
        this.name = name;
        this.anschrift = anschrift;
        this.versandKosten = versandKosten;
    }


    /**
     * Getter Methode getName()
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Getter Methode getBestellungenHaendler
     * @return bestellungenHaendler
     */
    public ArrayList<Bestellung> getBestellungenHaendler() {
        return bestellungenHaendler;
    }

    /**
     * Getter Methode getAnschrift
     * @return anschrift
     */
    public String getAnschrift() {
        return anschrift;
    }

    /**
     * Getter Methode getVersandKosten
     * @return versandKosten
     */
    public int getVersandKosten() {
        return versandKosten;
    }

    /**
     * Setter Methode setBestellungenHaendler
     * @param bestellungenHaendler
     */
    public void setBestellungenHaendler(ArrayList<Bestellung> bestellungenHaendler) {
        this.bestellungenHaendler = bestellungenHaendler;
    }

    /**
     * Setter Methode setName
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setter Methode setAnschrift
     * @param anschrift
     */
    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

    /**
     * Setter Methode setVersandKosten
     * @param versandKosten
     */
    public void setVersandKosten(int versandKosten) {
        this.versandKosten = versandKosten;
    }

    /**
     * Methode addBestellung zum hinzufuegen einen
     * BestellungenHaendler fuer Kunde
     * @param einBestellungenHaendler
     */
    public void addBestellung(Bestellung einBestellungenHaendler){

        bestellungenHaendler.add(einBestellungenHaendler);
    }

    /**
     * Methode delBestellung zum Entfernen einen
     * BestellungenHaendler fuer Kunde
     * @param einBestellungenHaendler
     */
    public void delBestellung(Bestellung einBestellungenHaendler){

        bestellungenHaendler.remove(einBestellungenHaendler);
    }

    /**
     * Methode OnlineHaendlerInformationen()
     * Ohne RueckgabeWert
     */
    public void onlineHaendlerInfromationen(){

        System.out.println("Name: "+getName()+",\tAnschrif: "+getAnschrift()+
                           ",\tversandkosten: "+getVersandKosten()+"€");

    }

}
