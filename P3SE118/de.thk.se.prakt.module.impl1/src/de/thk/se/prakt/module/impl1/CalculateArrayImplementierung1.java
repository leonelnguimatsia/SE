/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse CalculateArrayImplementierung1                  *
 *                                                                              *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.module.impl1;

import de.thk.se.prakt.module.calculateinterface.CalculateArray;

import java.util.Arrays;

public class CalculateArrayImplementierung1 implements CalculateArray {

    /**
     * Methode calculate() zur Berechnung den größten gemeinsamen Teiler (ggT) zur Zahl 8
     * @param original
     * @return tempKopie als neue int-Array mit der gleichen Laenge der Original-Array
     */

    @Override
    public int[] calculate(int[] original) {

        // Hilfsvariable( tempKopie) und liefert eine Kopie des Arrays original mit der Länge newLength
        int[] tempKopie = Arrays.copyOf(original, original.length);

        int x,y;
        for(int i = 0; i < tempKopie.length; i++){

            x = tempKopie[i];
            y = 8;

            // Berechnnung der  größten gemeinsamen Teiler (ggT) zur Zahl 8
            while ( y != 0){

                if(x > y){

                    x = x - y;
                }
                else{

                    y = y - x;
                }

                tempKopie[i] = x;
            }

        }

        return tempKopie;

    }

    /**
     * Methode getImplProperty() zur Lieferung  der Berechnungsart der konkreten Implementierung der Methode calculate
     * @return  der String „ggT“ als Ergebnis
     */
    @Override
    public String getImplProperty() {

            return new String("ggT");
    }
}
