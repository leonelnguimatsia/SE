/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse CalculateArray                                  *
 *                                                                              *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.module.calculateinterface;

public interface CalculateArray {

    /**
     * Methode calculate() zum Implementierung
     * @param original
     * @return  ein neues Integer-Array
     *
     */

    public int[] calculate(int[] original);

    /**
     * Methode getImplProperty() zum Implementieren
     * @return Ein String fuer die Berechnungsart der konkreten
     *         Implementierung der Methode calculate
     */
    public String getImplProperty();

}
