/*******************************************************************************
 * Autor: Leonel Nguimatsia                                                     *
 * @version: IntelliJ2021 JDK16                                                 *
 * Hochschule: TH-Kloen                                                         *
 * Ort: Deutz Technische Hochschule                                             *
 * Webmail: leonel.nguimatsia_tsobguim@smail.th-koeln.de                        *
 * Beschreibung: EntitaetKlasse UnternehmenMitgliedsgebuehr                     *
 *               implements BerechnungMitgliedsgebuehr                                                               *
 ********************************************************************************/
package de.thk.se.prakt.handelskammer.code;

import java.util.ArrayList;

public class UnternehmenMitgliedsgebuehr implements BerechnungMitgliedsgebuehr{

    private ArrayList<Unternehmen> mitgliedsunternehmen;

    public UnternehmenMitgliedsgebuehr(){

        this.mitgliedsunternehmen = new ArrayList<Unternehmen>();
    }

    /**
     * Methode istMitglied()
     * @param name
     * @return true ,falls ein Unterhmen mit diesem Name in der UnternehmenListe  existiert oder
     *         false,falls kein Unterhmen mit diesem Name in der UnternehmenListe  existiert
     */
    @Override
    public boolean istMitglied(String name) {

     for(Unternehmen unternehmenName : mitgliedsunternehmen) {

         if (unternehmenName.getName().equals(name)) {

             return true;
         }
     }

     return false;

    }

    /**
     * Methode findeUnternehmen()
     * @param mitgliedsNr
     * @return das Unternehmen aus der Unternehmensliste mit dieser Mitgliedsnummer
     * @throws MitgliedNotFoundException
     * Wirft eine MitgliedNotFoundException, falls die Unternehmensliste leer ist.
     * Wirft eine MitgliedNotFoundException, falls sich kein Unternehmen mit dieser Mitgliedsnummer in der Unternehmensliste befindet
     *
     */
    @Override
    public Unternehmen findeUnternehmen(int mitgliedsNr) throws MitgliedNotFoundException {

       if(mitgliedsunternehmen.isEmpty()){

           throw  new MitgliedNotFoundException("Kein Unternehmen vorhanden!!!");
       }

        for(Unternehmen unternehmenName : mitgliedsunternehmen){

            if(unternehmenName.getMitgliedsNummer() == mitgliedsNr)

                return unternehmenName;
        }

       throw new MitgliedNotFoundException("Es existiert kein Unternehmen mit dieser MitgliedNummer in der UnternehmenList");
    }

    /**
     * Methode addUnternehmen() zum Hinzufuegen ein Unternehmen zur Unternehmensliste
     * @param neuesUnternehmen
     */
    @Override
    public void addUnternehmen(Unternehmen neuesUnternehmen) {

        mitgliedsunternehmen.add(neuesUnternehmen);

    }

    /**
     * Methode delUnternehmen() zum Entfernen ein Unternehmen zur Unternehmensliste
     * @param entferntesUnternehmen
     */
    @Override
    public void delUnternehmen(Unternehmen entferntesUnternehmen) {

        mitgliedsunternehmen.add(entferntesUnternehmen);

    }

    /**
     * Methode berechneMitgliedsgebuehr(): berechnet die Mitgliedsgebühr für dieses Unternehmen für das übergebene Jahr
     * @param mitgliedsNr
     * @param jahr
     * @return mitgliedGebuehr
     * @throws MitgliedNotFoundException
     *  reicht die geworfene Exception MitgliedNotFoundException an den Aufrufer weiter
     * @throws FalschesJahrException
     * Wirft eine FalschesJahrException, falls das übergebene Jahr echt kleiner als das erste Mitgliedsjahr des Unternehmens ist
     */
    @Override
    public double berechneMitgliedsgebuehr(int mitgliedsNr, int jahr) throws MitgliedNotFoundException, FalschesJahrException {

        Unternehmen  unternehmen = findeUnternehmen(mitgliedsNr);

        double mitgliedGebuehr = 0.0;

        if(unternehmen.getErstesMitgliedsJahr() == jahr){


                mitgliedGebuehr = (0.10) * unternehmen.getAnzahlAngestellte();

        }

         else if (((unternehmen.getErstesMitgliedsJahr()+ 1) == jahr) || ((unternehmen.getErstesMitgliedsJahr()+2)== jahr)){

                mitgliedGebuehr = (0.09) * unternehmen.getAnzahlAngestellte();


        }

        else if(((unternehmen.getErstesMitgliedsJahr()+ 3) == jahr) || ((unternehmen.getErstesMitgliedsJahr()+4)== jahr)){

                mitgliedGebuehr = (0.08) * unternehmen.getAnzahlAngestellte();

        }

       else if(((unternehmen.getErstesMitgliedsJahr()+ 5) == jahr) || ((unternehmen.getErstesMitgliedsJahr()+6)== jahr)){

                mitgliedGebuehr = (0.07) * unternehmen.getAnzahlAngestellte();
        }

       else if((jahr - unternehmen.getErstesMitgliedsJahr()) >= 7){

                mitgliedGebuehr = (0.05) * unternehmen.getAnzahlAngestellte();
        }

        else{

                 throw new FalschesJahrException("Das uebergebene Jahr ist kleiner als das erste MitgliedsJahr ");
        }

      return mitgliedGebuehr;
    }

}
