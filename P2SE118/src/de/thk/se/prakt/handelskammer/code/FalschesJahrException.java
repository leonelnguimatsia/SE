/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetExceptionKlasse FalschesJahrException                  *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.handelskammer.code;


public class FalschesJahrException extends Exception {

    /**
     * Methode FalschesJahrException()
     * @param message
     */
    public FalschesJahrException(String message) {
        super(message);
    }
}
