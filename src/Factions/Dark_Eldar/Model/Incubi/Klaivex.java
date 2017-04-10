package Factions.Dark_Eldar.Model.Incubi;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Klaivex extends DarkEldarModel{
    public Klaivex(){
        super(6,5,3,3,1,6,3,9,3,"Klaivex","The Incubi are a " +
                "mercenary order of Dark Eldar who dedicate themselves to the\n" +
                "perfection of the killing strike. Their services are in great demand, whether as\n" +
                "bodyguards or shock troops, and the Incubi will fight for any who can afford to\n" +
                "purchase their loyalty. Their obsession is the mastery of the klaive, a bladed weapon that\n" +
                "becomes as much a part of an Incubus as his own murderous heart. In battle the Incubi\n" +
                "wield these weapons with lethal precision, their every swing severing limbs and\n" +
                "shattering blades with contemptuous ease. The act of becoming an Incubus is dangerous\n" +
                "in the extreme; through long and gruelling practice, the strong prosper, while the weak\n" +
                "are cut down and their bodies burnt as an offering to the statue of Khaine at the heart of\n" +
                "each Incubus shrine.",30);
        setElites(true);
        setTroops(true);
        setCharacters(true);
        setFleet(true);
        setNightVision(true);
        setPowerFromPain(true);
        setRampage(true);
    }
}
