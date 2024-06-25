/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse JUnit Testfaelle fuer die Klasse                *
 *               UnternehmenMitgliedsgebuehrTest                                *
 *                                                                              *
 ********************************************************************************/

package de.thk.se.prakt.handelskammer.test;

import de.thk.se.prakt.handelskammer.code.FalschesJahrException;
import de.thk.se.prakt.handelskammer.code.MitgliedNotFoundException;
import de.thk.se.prakt.handelskammer.code.UnternehmenMitgliedsgebuehr;
import de.thk.se.prakt.handelskammer.code.Unternehmen;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;



public class UnternehmenMitgliedsgebuehrTest {

   private static UnternehmenMitgliedsgebuehr unternehmenMitgliedsgebuehr;

    // Definierter Anfangszustand vor jeden Test, dass die UnternehmenListe leer ist

    @Before
   public  void UnternehmenMitgliedsgeguehrEinrichten(){

       this.unternehmenMitgliedsgebuehr = new UnternehmenMitgliedsgebuehr();
   }

    //Test ob testIstMitglied() True zurueckgibt Wenn ein Unternehmen in der Unternehmensliste vorhanden ist

    @Test
    public void testIstMitgliedTrue() {

        unternehmenMitgliedsgebuehr.addUnternehmen(new Unternehmen("Microsoft",64,10,2000));
        boolean aktuelleUnternehmen = unternehmenMitgliedsgebuehr.istMitglied("Microsoft");
        assertTrue(aktuelleUnternehmen);

    }

    //Test ob testIstMitglied() False zurueckgibt Wenn ein Unternehmen in der Unternehmensliste nicht vorhanden ist

    @Test
    public void testIstMitgliedFalse() {

        unternehmenMitgliedsgebuehr.addUnternehmen(new Unternehmen("REWE",64,10,2000));
        boolean aktuelleUnternehmen = unternehmenMitgliedsgebuehr.istMitglied("Microsoft");
        assertFalse(aktuelleUnternehmen);

    }

    //Test ob testFindeUnternehmenException_1() eine Exception MitgliedNotFoundException wirft,
    //Wenn kein Unternehmen mit der Mitgliedsnummer 531 in der nicht-leeren Unternehmensliste existiert.

    @Test(expected = MitgliedNotFoundException.class)
    public void testFindeUnternehmenException_1() throws MitgliedNotFoundException {

        unternehmenMitgliedsgebuehr.addUnternehmen(new Unternehmen("Microsoft",64,10,200));
        Unternehmen aktuelleMitgliedNummer = unternehmenMitgliedsgebuehr.findeUnternehmen(531);
    }

    //Test ob tesFindeUnternehmen() genau dieses Unternehmen liefert
    //Wenn das Unternehmen mit der Mitgliedsnummer 531 in der nicht-leeren Unternehmensliste existiert

    @Test
    public void testFindeUnternehmen() throws MitgliedNotFoundException{

        Unternehmen unternehmenMitgliedNummer = new Unternehmen("Microsoft",531,10,2000);
        unternehmenMitgliedsgebuehr.addUnternehmen(unternehmenMitgliedNummer);
        Unternehmen aktuelleUnternehmenMitgliedNummer = unternehmenMitgliedsgebuehr.findeUnternehmen(531);
        assertEquals(unternehmenMitgliedNummer,aktuelleUnternehmenMitgliedNummer);

    }

    //Test ob testFindeUnternehmenException_2() eine Exception MitgliedNotFoundException wirft,
    //Wenn die Unternehmensliste leer ist.

    @Test(expected = MitgliedNotFoundException.class)
    public void testFindeUnternehmenException_2() throws MitgliedNotFoundException {

        Unternehmen aktuelleMitgliedNummer = unternehmenMitgliedsgebuehr.findeUnternehmen(531);
    }


    //Test ob testBerechneMitgliedsgebuehrJahrException() eine Exception FalschesJahrException wirft
    // Fuer ein Unternehmen mit der Mitgliedsnummer 2573 und dem ersten Mitgliedsjahr 2003

    @Test(expected =FalschesJahrException.class)
    public void testBerechneMitgliedsgebuehrJahrException() throws FalschesJahrException, MitgliedNotFoundException {

       Unternehmen unternehmenMitgliedJahr = new Unternehmen("Microsoft",2573,10,2003);
       unternehmenMitgliedsgebuehr.addUnternehmen(unternehmenMitgliedJahr);
       double mitGliedsgebuehr = unternehmenMitgliedsgebuehr.berechneMitgliedsgebuehr(2573,2000);
    }
}