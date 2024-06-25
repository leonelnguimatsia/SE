/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse Unternehmen                                     *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.handelskammer.code;

public class Unternehmen {

   //Deklaration der Attribute der Klasse Unternehmen
    private String name;
    private int mitgliedsNummer;
    private int anzahlAngestellte;
    private int erstesMitgliedsJahr;

    /**
     * Konstruktor Unternehmen() mit Parametern
     * @param name
     * @param mitgliedsNr
     * @param anzahlAng
     * @param erstesJahr
     */
    public Unternehmen(String name, int mitgliedsNr, int anzahlAng, int erstesJahr) {
        this.name = name;
        this.mitgliedsNummer = mitgliedsNr;
        this.anzahlAngestellte = anzahlAng;
        this.erstesMitgliedsJahr = erstesJahr;
    }

    /**
     * Getter Methode getName()
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter Methode setName()
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter Methode getMitgliedsNummer()
     * @return mitgliedsNummer
     */
    public int getMitgliedsNummer() {
        return mitgliedsNummer;
    }

    /**
     * Setter Methode setMitgliedsNummer()
     * @param mitgliedsNummer
     */
    public void setMitgliedsNummer(int mitgliedsNummer) {
        this.mitgliedsNummer = mitgliedsNummer;
    }

    /**
     * Getter Methode getAnzahlAngestellte()
     * @return anzahlAngestellte
     */
    public int getAnzahlAngestellte() {
        return anzahlAngestellte;
    }

    /**
     * Setter Methode setAnzahlAngestellte()
     * @param anzahlAngestellte
     */
    public void setAnzahlAngestellte(int anzahlAngestellte) {
        this.anzahlAngestellte = anzahlAngestellte;
    }

    /**
     * Getter Methode getErstesMitgliedsJahr()
     * @return erstesMitgliedsJahr
     */
    public int getErstesMitgliedsJahr() {
        return erstesMitgliedsJahr;
    }

    /**
     * Setter Methode setErstesMitgliedsJahr()
     * @param erstesMitgliedsJahr
     */
    public void setErstesMitgliedsJahr(int erstesMitgliedsJahr) {
        this.erstesMitgliedsJahr = erstesMitgliedsJahr;
    }
}
