/**************************************************************************************
 * Autor: Leonel Nguimatsia                                                           *
 * @version: IntelliJ2021 JDK16                                                       *
 * Hochschule: TH-Kloen                                                               *
 * Ort: Deutz Technische Hochschule                                                   *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                              *
 * Beschreibung: EntitaetKlasse JUnit Testsuite AllUnternehmenMitgliedsgebuehrTests   *
 *                                                                                    *
 *                                                                                    *
 *************************************************************************************/

package de.thk.se.prakt.handelskammer.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// JUnit Testsuite zum Ausfuehren aller Testfaelle
@RunWith(Suite.class)
@Suite.SuiteClasses({

       UnternehmenMitgliedsgebuehrTest.class,
       TestBerechneMitgliedsgebuehrParameterized.class,

})
public class AllUnternehmenMitgliedsgebuehrTests {

}
