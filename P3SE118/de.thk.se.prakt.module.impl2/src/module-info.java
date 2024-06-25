module de.thk.se.prakt.module.impl2 {

    requires de.thk.se.prakt.module.calculateinterface;
    provides de.thk.se.prakt.module.calculateinterface.CalculateArray with
             de.thk.se.prakt.module.impl2.CalculateArrayImplementierung2;
}