package Factions.Dark_Eldar.Model.Monsters;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/10/2017.
 */
public class Cronos extends DarkEldarModel{
    public Cronos(){
        super(3,3,5,7,3,4,3,10,3,"Cronos","Through a blend of " +
                "alchemy and science, the Cronos drains away not the vital fluids\n" +
                "of its victims but their life essence. What remains of its prey when the engine has drunk\n" +
                "its fill is a testament to the diabolical skill of its creators – to the onlooker, the Cronos’\n" +
                "victims seem to age at an incredible rate, wrinkling and rotting until nothing is left but\n" +
                "ancient-looking cadavers. Once the Cronos has fed on its prey, their stolen vitality is\n" +
                "magnified and projected from its resonator vanes. Pulsing waves of spirit-essence flow\n" +
                "outward to those Dark Eldar standing near the Cronos, rendering them stronger and\n" +
                "more vital even as the foe wither and crumble to dust. Many Archons will pay\n" +
                "handsomely for one or more Cronos to accompany their forces, for should the fighting\n" +
                "become protracted, having such an invigorating horror on hand can make all the\n" +
                "difference.",100);
        setHeavySupport(true);
        setMonstrousCreatures(true);
        setFearless(true);
        setFeelNoPain(true);
        setNightVision(true);
    }
}
