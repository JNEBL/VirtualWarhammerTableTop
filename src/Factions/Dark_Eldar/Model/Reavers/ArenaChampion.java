package Factions.Dark_Eldar.Model.Reavers;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/10/2017.
 */
public class ArenaChampion extends DarkEldarModel{
    public ArenaChampion(){
        super(4,4,3,4,1,6,2,9,5,"Arena Champion","The Eldar experience " +
                "sensations to a greater degree than any other race, and their\n" +
                "psyches are easily given to obsession. Reavers, having cultivated a taste for high-speed\n" +
                "violence, are consumed with the act of the maximum-impact kill. They scream into battle\n" +
                "astride Reaver jetbikes that move faster than the eye can see, their aerobatic skill\n" +
                "matched only by their desire for murder. Reavers fly with such uncanny precision that\n" +
                "they can take off a head or slash open a throat with a single pass of their jetbike’s keel\n" +
                "blade. A fatal blow delivered at speed provides a murderous joy that Reavers consider\n" +
                "the ultimate thrill. In the toroid arenas that girdle the highest spires, these vain and\n" +
                "competitive riders engage in nightly death races, screaming round each arena in running\n" +
                "battles for the entertainment of the bloodthirsty crowd.",26);
        setFastAttack(true);
        setEldarJetBikes(true);
        setCharacters(true);
        setCombatDrug(true);
        setHitAndRun(true);
        setNightVision(true);
        setPowerFromPain(true);
        setSkilledRider(true);
    }
}
