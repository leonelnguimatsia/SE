
/*****************************************************************
 * Autor: Leonel Nguimatsia                                      *
 * @version: IntelliJ2021 JDK16                                  *
 * Hochschule: TH-Kloen                                          *
 * Ort: Deutz Technische Hochschule                              *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de         *
 * Beschreibung: EntitaetKlasse OnlineHandlerTest                *
 *                                                               *
 *****************************************************************/
package de.thk.se.prakt.test;

import de.thk.se.prakt.kunden.Bestellung;
import de.thk.se.prakt.kunden.Kunde;
import de.thk.se.prakt.onlinehandel.Artikel;
import de.thk.se.prakt.onlinehandel.OnlineHaendler;

public class OnlineHandelTest {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("OnlineHaendler: ");
        OnlineHaendler haendler1 = new OnlineHaendler("Schmidt","Köln",18);
        OnlineHaendler haendler2 = new OnlineHaendler("Jeff","Düsseldorf",56);
        OnlineHaendler haendler3 = new OnlineHaendler("OnlineParadise","Aachen",31);

        System.out.print("* Haendler1: ");
        haendler1.onlineHaendlerInfromationen();

        System.out.print("* Haendler2: ");
        haendler2.onlineHaendlerInfromationen();

        System.out.print("* Haendler3: ");
        haendler3.onlineHaendlerInfromationen();
        System.out.println();

        System.out.println("Kunde:");

        Kunde kunde1 = new Kunde("Peter");
        Kunde kunde2 = new Kunde("Klaus");
        Kunde kunde3 = new Kunde("Martin");

        System.out.print("* Kunde1: "+kunde1.getName());
        System.out.println();

        System.out.print("* Kunde2: "+kunde2.getName());
        System.out.println();

        System.out.print("* Kunde3: "+kunde3.getName());

        System.out.println();
        System.out.println();
        System.out.println("Artikel: ");

        Artikel artikel1 = new Artikel("Bohrmaschine",206);
        Artikel artikel2 = new Artikel("Schraubenet",13);
        Artikel artikel3 = new Artikel("Druckerpatrone",104);
        Artikel artikel4 = new Artikel("Buch",22);
        Artikel artikel5 = new Artikel("Rasemaeher",390);

        System.out.print("* Artikel1: ");
        artikel1.artikelInformationen();

        System.out.print("* Artikel2: ");
        artikel2.artikelInformationen();

        System.out.print("* Artikel3: ");
        artikel3.artikelInformationen();

        System.out.print("* Artikel4: ");
        artikel4.artikelInformationen();

        System.out.print("* Artikel5: ");
        artikel5.artikelInformationen();

        System.out.println();
        System.out.println();
        System.out.println("Bestellungen: ");
        System.out.println();

        Bestellung bestellung1 = new Bestellung("13.08.2021",kunde3,haendler3);
        bestellung1.addArtikel(artikel3);
        bestellung1.addArtikel(artikel1);
        bestellung1.addArtikel(artikel5);

        System.out.print("*Bestellung1: ");
        bestellung1.bestellungsInformationen();

        System.out.println();
        System.out.println();
        Bestellung bestellung2 = new Bestellung("01.09.2020",kunde1,haendler2);
        bestellung2.addArtikel(artikel3);
        bestellung2.addArtikel(artikel4);
        bestellung2.addArtikel(artikel5);

        System.out.print("*Bestellung2: ");
        bestellung2.bestellungsInformationen();

        System.out.println();
        System.out.println();
        Bestellung bestellung3 = new Bestellung("16.10.2021",kunde2,haendler3);
        bestellung3.addArtikel(artikel4);
        bestellung3.addArtikel(artikel2);
        bestellung3.addArtikel(artikel3);

        System.out.print("*Bestellung3: ");
        bestellung3.bestellungsInformationen();

        System.out.println();
        System.out.println();
        Bestellung bestellung4 = new Bestellung("22.04.2020",kunde3,haendler1);
        bestellung4.addArtikel(artikel1);
        bestellung4.addArtikel(artikel2);
        bestellung4.addArtikel(artikel3);

        System.out.print("*Bestellung4: ");
        bestellung4.bestellungsInformationen();

        System.out.println();
        System.out.println();
        System.out.println("Die kosten Alle Bestellungen der Jeweiligen Kunde:");
        System.out.println();

        System.out.print("*Kunde1: ");
        System.out.println(""+kunde1.getName()+" Kosten: "+kunde1.kostenAllerBestellungen()+"€");

        System.out.println();
        System.out.print("*Kunde2: ");
        System.out.println(""+kunde2.getName()+" Kosten: "+kunde2.kostenAllerBestellungen()+"€");

        System.out.println();
        System.out.print("*Kunde3: ");
        System.out.println(""+kunde3.getName()+" Kosten: "+kunde3.kostenAllerBestellungen()+"€");
        
    }
}
