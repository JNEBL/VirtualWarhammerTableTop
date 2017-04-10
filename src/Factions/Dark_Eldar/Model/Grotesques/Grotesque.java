package Factions.Dark_Eldar.Model.Grotesques;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Grotesque extends DarkEldarModel{
    public Grotesque(){
        super(4,1,5,5,3,4,3,3,6,"Grotesque","Though they begin " +
                "existence as Dark Eldar, Grotesques undergo a hideous rebirth as\n" +
                "punishment for some real or perceived slight to the Haemonculi. Over the course of\n" +
                "months or even years the hapless victim’s body is pumped full of growth elixirs and\n" +
                "subjected to torturous surgical enhancement until they become a subservient,\n" +
                "weaponised horror whose only desire is to serve its dark masters. When given the\n" +
                "command to kill, these meat-hulks transform into engines of destruction. Racks of\n" +
                "syringes dump potent stimulants into their ichor-stream and veins throb near to\n" +
                "bursting as tube-punctured hearts are forced into overdrive. With a great, muffled roar\n" +
                "the Grotesques thunder into battle, butchering all within reach with greathook, claw and\n" +
                "cleaver until commanded to cease or hacked bodily into many pieces.",35);
        setElites(true);
        setInfantry(true);
        setBulky(true);
        setFeelNoPain(true);
        setNightVision(true);
        setPowerFromPain(true);
        setRampage(true);
    }
}
