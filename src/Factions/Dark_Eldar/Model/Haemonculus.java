package Factions.Dark_Eldar.Model;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Haemonculus extends DarkEldarModel {
    public Haemonculus(){
        super(5,5,3,4,3,5,3,9,6,"Haemonculus","Ancient and horrific," +
                " the Haemonculi are deranged flesh-sculptors that dwell in the\n" +
                "dark bowels of Commorragh. They are master torturers and expert poisoners, dark\n" +
                "alchemists who revel in every nuance of the suffering they inflict upon others. To while\n" +
                "away the centuries the Haemonculi craft long symphonies of agony from those\n" +
                "unfortunates held captive in their oubliettes. So horrific are their practices that they are\n" +
                "feared by all denizens of the Dark City, even the most powerful Archons and Succubi.\n" +
                "Over the millennia, each Haemonculus’ tastes have become increasingly twisted and\n" +
                "incredibly specific. Having transcended common notions of wealth, they prize unusual\n" +
                "ingredients for their alchemical elixirs – the distilled heart of an Arbites judge may yield\n" +
                "a striking flavour of pure resolve, whereas the essence of a once-proud Planetary\n" +
                "Governor gives a tang of vainglory that thrills on their black tongues. In battle, the\n" +
                "Haemonculi orchestrate the carnage around them with the passion of an artist. They use\n" +
                "extreme and terrible wargear, able to cause uncontrollable growth with a single touch or\n" +
                "turn their foes to glass in an instant. A Haemonculus drifts across the field of battle with\n" +
                "a macabre elegance, gifting those too slow to escape with an unimaginably painful death.",70);
        setHq(true);
        setInfantry(true);
        setCharacters(true);
        setFeelNoPain(true);
        setIndependentCharacter(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
