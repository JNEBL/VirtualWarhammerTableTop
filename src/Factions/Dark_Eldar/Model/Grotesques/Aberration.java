package Factions.Dark_Eldar.Model.Grotesques;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Aberration extends DarkEldarModel{
    public Aberration(){
        super(4,1,5,5,3,4,4,4,6,"Aberration","Though they begin " +
                "existence as Dark Eldar, Grotesques undergo a hideous rebirth as\n" +
                "punishment for some real or perceived slight to the Haemonculi. Over the course of\n" +
                "months or even years the hapless victim’s body is pumped full of growth elixirs and\n" +
                "subjected to torturous surgical enhancement until they become a subservient,\n" +
                "weaponised horror whose only desire is to serve its dark masters. When given the\n" +
                "command to kill, these meat-hulks transform into engines of destruction. Racks of\n" +
                "syringes dump potent stimulants into their ichor-stream and veins throb near to\n" +
                "bursting as tube-punctured hearts are forced into overdrive. With a great, muffled roar\n" +
                "the Grotesques thunder into battle, butchering all within reach with greathook, claw and\n" +
                "cleaver until commanded to cease or hacked bodily into many pieces.",45);
        setElites(true);
        setInfantry(true);
        setCharacters(true);
        setBulky(true);
        setFeelNoPain(true);
        setNightVision(true);
        setPowerFromPain(true);
        setRampage(true);
    }
}
