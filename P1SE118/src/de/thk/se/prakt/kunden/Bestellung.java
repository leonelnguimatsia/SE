
/*****************************************************************
 * Autor: Leonel Nguimatsia                                      *
 * @version: IntelliJ2021 JDK16                                  *
 * Hochschule: TH-Kloen                                          *
 * Ort: Deutz Technische Hochschule                              *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de         *
 * Beschreibung: EntitaetKlasse Bestellung                       *
 *                                                               *
 *****************************************************************/
package de.thk.se.prakt.kunden;

import de.thk.se.prakt.onlinehandel.Artikel;
import de.thk.se.prakt.onlinehandel.OnlineHaendler;

import java.util.ArrayList;

public class Bestellung {

    private Kunde kunde;
    private String datum;
    private ArrayList<Artikel> artikel;
    private OnlineHaendler haendler;

    /**
     * Konstruktor ohne Parameter, Aber
     * Erzeugung einer ArrayList<Artikel>
     * fuer Arktil
     */
    public Bestellung(){

        artikel = new ArrayList<Artikel>();
    }

    /**
     * Konstruktor mit Parameter und
     * Erzeugung einer ArrayList<Artikel>
     * fuer Artikle
     * @param kunde
     * @param datum
     * @param haendler
     */
    public Bestellung( String datum, Kunde kunde, OnlineHaendler haendler){

        artikel = new ArrayList<Artikel>();
        this.datum = datum;
        this.kunde = kunde;
        this.haendler = haendler;
        kunde.addBestellung(this);

    }

    /**
     * Getter Methode getArtikel()
     * @return artikel
     */
    public ArrayList<Artikel> getArtikel() {
        return artikel;
    }

    /**
     * Getter Methode getDatum()
     * @return datum
     */
    public String getDatum() {
        return datum;
    }

    /**
     * Getter Methode getKunde()
     * @return kunde
     */
    public Kunde getKunde() {
        return kunde;
    }


    /**
     * Getter Methode getHaendler()
     * @return haendler
     */
    public OnlineHaendler getHaendler() {
        return haendler;
    }

    /**
     * Setter Methode setArtikel
     * @param artikel
     */
    public void setArtikel(ArrayList<Artikel> artikel) {
        this.artikel = artikel;
    }

    /**
     * Setter Methode setDatum
     * @param datum
     */
    public void setDatum(String datum) {
        this.datum = datum;
    }

    /**
     * Setter Methode setKunde
     * @param kunde
     */
    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    /**
     * Setter methode setHaendler
     * @param haendler
     */
    public void setHaendler(OnlineHaendler haendler) {
        this.haendler = haendler;
    }

    /**
     * Methode AddArtiikel zum Hinzufuegen einen
     * Artikel fuer Kunden
     * @param einArtikel
     */
    public void addArtikel(Artikel einArtikel){

        artikel.add(einArtikel);
        einArtikel.addBestellungen(this);
    }

    /**
     * Methode delArtiikel zum Entfernen einen
     * Artikel fuer Kunden
     * @param einArtikel
     */
    public void delArtikle(Artikel einArtikel){

        artikel.remove(einArtikel);
    }

    /**
     * Methode summePreisAllerArtikel
     * @return summePreisArtikel
     */
    public int summePreisAllerArtikel(){

        int summePreisArtikel = 0;

        for(int i=0; i< artikel.size();i++){

            summePreisArtikel += artikel.get(i).getPreis();
        }

       return summePreisArtikel;
    }

    /**
     * Methode bestellungsInformationen()
     * Ohne RueckgabeWert
     */
    public void bestellungsInformationen(){

        System.out.println("\tDatum: "+datum+" ,Kunde: "+kunde.getName()+" ");
        System.out.print("\t\t\t\tOnlineHaendler: ");
        haendler.onlineHaendlerInfromationen();

        System.out.println("\t\t\t\tArtikel: ");

        for(Artikel art : artikel){

            System.out.println("\t\t\t\tBezeichnung: "+art.getBezeichnung()+" ,Preis: "+art.getPreis()+"€");

        }
    }


}
