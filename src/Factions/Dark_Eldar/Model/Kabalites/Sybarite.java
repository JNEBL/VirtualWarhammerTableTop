package Factions.Dark_Eldar.Model.Kabalites;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Sybarite extends DarkEldarModel{
    public Sybarite(){
        super(4,4,3,3,1,5,2,9,5,"Sybarite","Kabalite " +
                "Warriors are the poison lifeblood of their Kabal. Each warrior must carve\n" +
                "out a fearful reputation in the war-torn halls of High Commorragh, proving himself time\n" +
                "and time again. Even then, only a chosen few enjoy the prestige of raiding the worlds of\n" +
                "realspace. Be they male or female, Kabalite Warriors are tall and athletically built,\n" +
                "powerful in stature and violent in temperament. When going to war, each Warrior dons\n" +
                "a sophisticated bodysuit of segmented armour. This is held in place with long metal\n" +
                "barbs and hooks that penetrate the wearer’s nerve bundles, sharpening his senses withthe constant \n" +
                "sting of pain. Kabalite Warriors carry a wide array of fiendish weapons,\n" +
                "predominately long-ranged in nature, for few have the influence to ensure regeneration\n" +
                "in the lairs of the Haemonculi, and so they prefer to kill from afar.",18);
        setTroops(true);
        setInfantry(true);
        setCharacters(true);
        setFleet(true);
        setPowerFromPain(true);
    }
}
