/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse JUnit parametrisierten Test fuer die Methode    *
 *               berechneMitgliedsgebuehr                                       *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.handelskammer.test;

import de.thk.se.prakt.handelskammer.code.FalschesJahrException;
import de.thk.se.prakt.handelskammer.code.MitgliedNotFoundException;
import de.thk.se.prakt.handelskammer.code.Unternehmen;
import de.thk.se.prakt.handelskammer.code.UnternehmenMitgliedsgebuehr;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestBerechneMitgliedsgebuehrParameterized {

    //Definierte Attribute fuer TestBerechneMitgliedsgebuehrParameterized

    private static UnternehmenMitgliedsgebuehr unternehmenMitgliedsgebuehr;
    private String paramName;
    private int paramMitgliedsNummer;
    private int paramAnzahlAngestellte;
    private int paramErstesMitgliedsJahr;
    private int paramAktuelleErstesMitgliedsJahr;
    private double resultMitgliedGebuehr;

    /**
     * Konstruktor TestBerechneMitgliedsgebuehrParameterized() mit Parametern
     * @param paramName
     * @param paramMitgliedsNummer
     * @param paramAnzahlAngestellte
     * @param paramErstesMitgliedsJahr
     * @param paramAktuelleErstesMitgliedsJahr
     * @param resultMitgliedGebuehr
     */
    public TestBerechneMitgliedsgebuehrParameterized(String paramName, int paramMitgliedsNummer,
                                                     int paramAnzahlAngestellte, int paramErstesMitgliedsJahr,
                                                     int paramAktuelleErstesMitgliedsJahr, double resultMitgliedGebuehr){

        this.paramName = paramName;
        this.paramMitgliedsNummer = paramMitgliedsNummer;
        this.paramAnzahlAngestellte = paramAnzahlAngestellte;
        this.paramErstesMitgliedsJahr = paramErstesMitgliedsJahr;
        this.paramAktuelleErstesMitgliedsJahr = paramAktuelleErstesMitgliedsJahr;
        this.resultMitgliedGebuehr = resultMitgliedGebuehr;
    }

    // Definierter Anfangszustand vor jeden Test, dass die UnternehmenListe leer ist
    @Before
    public void UnternehmenMitgliedsgebuehrEinrichten(){

        unternehmenMitgliedsgebuehr = new UnternehmenMitgliedsgebuehr();
    }

    //Liste der TestParameter
    //{ Name , MitgliedsNr , AnzahlAngestellte , ErstesMitgliedsJahr , AktuelleErstesMitgliedsJahr, resultMitgliedGebuehr }
    @Parameterized.Parameters
    public static Collection Param(){

        return Arrays.asList(new Object[][]{

                 {"Microsoft",96,57,2016,2016,5.70},
                 {"MERCEDES",321,1346,2020,2021,121.14},
                 {"REWE",135,180,2016,2020,14.4},
                 {"SANTA LUCIA",1,256,2010,2015,17.92},
                 {"BAUHAUS",4567,739,1999,2021,36.95}
        });
    }

    // Die eigentliche Testmethode, legt einen neuen Unternehmen an,  fügt der Unternehmen in der UnternehmenListe hinzu,
    // um dann die Methode berechneMitgliedsgebuehr zu testen.
    @Test
    public void testBerechneMitgliedsgebuehrParameterized() throws MitgliedNotFoundException, FalschesJahrException {

        Unternehmen unternehmen = new Unternehmen(paramName,paramMitgliedsNummer,paramAnzahlAngestellte,paramErstesMitgliedsJahr);
        unternehmenMitgliedsgebuehr.addUnternehmen(unternehmen);
        double mitgliedsgebuehr = unternehmenMitgliedsgebuehr.berechneMitgliedsgebuehr(paramMitgliedsNummer,paramAktuelleErstesMitgliedsJahr);
        assertEquals(resultMitgliedGebuehr,mitgliedsgebuehr,0.01);
    }
}
