/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetExceptionKlasse MitgliedNotFoundException              *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.handelskammer.code;

public class MitgliedNotFoundException extends Exception {

    /**
     * Methode MitgliedNotFoundException()
     * @param message
     */
    public MitgliedNotFoundException(String message) {
        super(message);
    }
}
