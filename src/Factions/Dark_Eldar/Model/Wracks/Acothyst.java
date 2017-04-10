package Factions.Dark_Eldar.Model.Wracks;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Acothyst extends DarkEldarModel {
    public Acothyst(){
        super(4,4,3,4,1,4,2,9,6,"Acothyst","Wracks are abhorrent " +
                "examples of their master’s surgical craftsmanship, cut apart\n" +
                "and refashioned into walking instruments of torture. Each Wrack’s sole duty is to serve\n" +
                "his master, whether at the mortuary slab or upon the battlefield. In the Wrack’s\n" +
                "surgically enhanced frame lies a surprising strength, and even terrible wounds are but\n" +
                "an inconvenience to these freakish acolytes. In battle they lay about themselves with\n" +
                "sickled blades, needled claws and silvered hooks, seeking to inflict the greatest amount of\n" +
                "suffering upon their hapless foes in as short a time as possible. Perhaps the most\n" +
                "sickening aspect of the Wrack’s strange plight is that they choose this terrible fate for\n" +
                "themselves. Most hope to transcend their previous lives entirely – a Wrack will endure\n" +
                "almost any degradation in the hope that one day he may become a Coven lord in his own\n" +
                "right.",20);
        setElites(true);
        setInfantry(true);
        setCharacters(true);
        setFeelNoPain(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
