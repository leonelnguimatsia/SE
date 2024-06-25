/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse AnwendungsKlasse                                *
 *                                                                              *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.module.anwendung;

import de.thk.se.prakt.module.calculateinterface.CalculateArray;

import java.util.Iterator;
import java.util.ServiceLoader;

// Eine Klasse, um die Modulabhaengigkeiten gemaess Aufgabenstellung zu ueberpruefen
public class AnwendungsKlasse {

    /**
     * Eine einfache Hilfsmethode, die die Elemente eines Arrays durch Komma getrennt ausgibt
     * @param array
     */
    public static void printArray (int[] array) {
        if (array.length == 0) {
            System.out.println("Array ist leer");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print (array[i] + ",");
        }
        System.out.println(array[array.length-1]+"]");
    }

    // Die main-Methode, die den Aublauf gemaess Aufgabenstellung durchfuehrt
    public static void main(String[] args) {

        // Initializierung der Original-Array
        int array_Beispiel[]= { 64, 112, 46, 9, 30, 23, 33, 440};

        // Haelt spaeter die Implementierung der größten gemeinsamen Teiler (ggT) zur Zahl 8
        CalculateArray ggT_Array = null;

        // Haelt spaeter die Implementierung der kleinste gemeinsame Vielfache (kgV) zur Zahl 5
        CalculateArray kgV_Array = null;

        // Hilfsvariable zur Arbeit mit dem Iterator
        CalculateArray temp;

        // Der Iterator ueber die lose gekoppelten Implementierungen des Interface CalculateArray
        //Alle Implementierungen für die Schnittstellenklasse per loser Kopplung holen
        Iterator<CalculateArray> iterator = ServiceLoader.load(CalculateArray.class).iterator();

        // Testen, ob überhaupt eine Implementierung vorhanden ist, ansonsten Programmabbruch
        if(!iterator.hasNext()){

            System.out.println("Keine Implementierung Vorhanden!!!");
            System.exit(0);
        }

        // Zuordnen der Implementierungen
        while(iterator.hasNext()){

            temp = iterator.next();

            if(temp.getImplProperty().equals("ggT")){

                ggT_Array = temp;
            }

            if(temp.getImplProperty().equals("kgV")){

                kgV_Array = temp;
            }
        }

        System.out.println();
        // Ausfuehren der Implementierung zur Berechnung der größten gemeinsamen Teiler (ggT) zur Zahl 8 und Ausgabe des Ergebnisses
        System.out.println("GGT der Beispiel_Array: ");
        printArray(ggT_Array.calculate(array_Beispiel));

        System.out.println();
        // Ausfuehren der Implementierung zur Berechnung der kleinste gemeinsame Vielfache (kgV) zur Zahl 5 und Ausgabe des Ergebnisses
        System.out.println("KGV der Beispiel_Array: ");
        printArray(kgV_Array.calculate(array_Beispiel));

        System.out.println();
        // Ausgabe des Original-Arrays
        System.out.println("Original Array: ");
        printArray(array_Beispiel);
    }
}
