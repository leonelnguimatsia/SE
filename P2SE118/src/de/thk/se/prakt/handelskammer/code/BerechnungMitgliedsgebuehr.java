/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetImplementKlasse BerechnungMitgliedsgebuehr             *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.handelskammer.code;

public interface BerechnungMitgliedsgebuehr {


    /**
     * Methode istMitglied() zum Implementieren
     * @param name
     * @return true oder False
     */

    public boolean istMitglied(String name);


    /**
     * Methode findeUnternehmen() zum Implementieren
     * @param mitgliedsNr
     * @return Unternehmen
     * @throws MitgliedNotFoundException
     */

    public Unternehmen findeUnternehmen(int mitgliedsNr) throws MitgliedNotFoundException;


    /**
     * Methode addUnternehmen() zum Implementieren
     * @param neuesUnternehmen
     */

    public void addUnternehmen(Unternehmen neuesUnternehmen);


    /**
     * Methode delUnternehmen() zum Implementieren
     * @param entferntesUnternehmen
     */

    public void delUnternehmen (Unternehmen entferntesUnternehmen);


    /**
     * Methode berechneMitgliedsgebuehr() zum Implementieren
     * @param mitgliedsNr
     * @param jahr
     * @return Mitgliedsgebuehr
     * @throws MitgliedNotFoundException
     * @throws FalschesJahrException
     */

    public double berechneMitgliedsgebuehr (int mitgliedsNr, int jahr) throws MitgliedNotFoundException, FalschesJahrException;
}
