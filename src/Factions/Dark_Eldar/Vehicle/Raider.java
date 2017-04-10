package Factions.Dark_Eldar.Vehicle;

import Factions.Dark_Eldar.Base.DarkEldarVehicle;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Raider extends DarkEldarVehicle{
    public Raider(){
        super(4,10,10,10,3,"Raider","Lightweight and manoeuvrable, Raiders " +
                "are open-decked piratical skiffs whose hulls\n" +
                "are fitted with sword-sharp fins and jagged keels with which to cut apart the foe. Though\n" +
                "each of these craft is customised by its owning Kabal, all have certain key features in\n" +
                "common – a repulsor keelblade manned by a talented steersman, aethersails to harness\n" +
                "the energies flowing from the webway portal from which they descend, and a prowmounted heavy weapon\n " +
                "to sow terror amongst the enemy. Raiders are ideally suited for\n" +
                "the fast-paced running battles of a Dark Eldar raid, swarming around and above the\n" +
                "enemy like sharks scenting blood. After a successful attack, enemy survivors will be\n" +
                "lashed or chained to the Raiders, or simply impaled upon their trophy hooks like bloodsoaked dolls.",55);
        setFastAttack(true);
        setSkimmer(true);
        setFast(true);
        setOpenTopped(true);
        setTransport(true);
        setDeepStrike(true);
        setNightVision(true);
    }
}
