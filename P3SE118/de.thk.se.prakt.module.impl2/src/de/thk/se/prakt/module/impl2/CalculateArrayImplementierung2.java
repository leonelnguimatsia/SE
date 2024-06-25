/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse CalculateArrayImplementierung2                  *
 *                                                                              *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.module.impl2;

import de.thk.se.prakt.module.calculateinterface.CalculateArray;

import java.util.Arrays;

public class CalculateArrayImplementierung2 implements CalculateArray {

    /**
     * Zwischensmethode ggt() zur Berechnung den größten gemeinsamen Teiler (ggT)
     * und wird dazu benutzt,um das kleinste gemeinsame Vielfache (kgV) zur Zahl 5 zu berechnen
     * @param x
     * @param y
     * @return der ggt von (x,y) als Ergebnis
     */
    public static int ggt(int x, int y) {

        while(y != 0){

            if(x > y)
                x = x-y;

            else
                y = y-x;
        }

        return x;
    }

    /**
     * Methode calculate() zur Berechnung der kleinsten gemeinsame Vielfache (kgV) zur Zahl 5
     * @param original
     * @return tempKopie als neue int-Array mit der gleichen Laenge der Original-Array
     */
    @Override
    public int[] calculate(int[] original) {

        // Hilfsvariable( tempKopie) und liefert eine Kopie des Arrays original mit der Länge newLength
        int[] tempKopie = Arrays.copyOf(original,original.length);

        int a, b;

        // Berechnung der kleinsten gemeinsame Vielfache (kgV) zur Zahl 5
        for(int i = 0; i < tempKopie.length; i++){

            a = tempKopie[i];
            b = 5 ;

            tempKopie[i] = (a*b) / ggt(a,b);
        }

        return tempKopie;
    }

    /**
     * Methode getImplProperty() zur Lieferung  der Berechnungsart der konkreten Implementierung der Methode calculate
     * @return der String „kgV“ als Ergebnis
     */

    @Override
    public String getImplProperty() {

        return new String("kgV");
    }
}
