package Factions.Dark_Eldar.Model.Monsters;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/10/2017.
 */
public class Talos extends DarkEldarModel{
    public Talos(){
        super(5,3,7,7,3,4,3,10,3,"Talos","The Engines of Pain, " +
                "of which the Talos is the most widespread, are seen as the\n" +
                "pinnacle of the Haemonculi’s art. Creations of mad genius, each is a twisted fusion of the\n" +
                "organic and the mechanical, festooned with surgical apparatus and weapons of war.\n" +
                "From the clanking Chainghoul favoured by the Prophets of Flesh to the drill-legged\n" +
                "Shriveners that guard the Everspiral, each is an unholy terror. These semi-sentient\n" +
                "constructs exude unhurried menace, the drone of their anti-gravitic motors a\n" +
                "counterpoint to the flicker-clack of silvered blades as they close with their prey. When a\n" +
                "Talos catches an enemy warrior, it begins a rapid and efficient disassembly of its victim,\n" +
                "drawing each constituent part into itself to create noxious potions and elixirs.",120);
        setHeavySupport(true);
        setMonstrousCreatures(true);
        setFearless(true);
        setFeelNoPain(true);
        setNightVision(true);
    }
}
