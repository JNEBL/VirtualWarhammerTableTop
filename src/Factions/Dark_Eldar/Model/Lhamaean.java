package Factions.Dark_Eldar.Model;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Lhamaean extends DarkEldarModel {
    public Lhamaean(){
        super(4,4,3,3,1,5,1,9,5,"Lhamaean","Kabalite lords surround " +
                "themselves with coteries of favoured retainers, pets and\n" +
                "bodyguards. From the looming, serpentine mercenaries known as Sslyth to packs of\n" +
                "drooling, fang-mawed Ur-Ghuls from the haunted pyramids of Shaa-dom, such a\n" +
                "retinue can be as varied as the tools in an overlord’s torture chamber. Lhamaeans lurk in\n" +
                "their master’s shadow, unobtrusive until the moment they strike, their poisoned blades\n" +
                "slicing armour, flesh and bone. Medusae shuffle forth at their master’s behest, foul\n" +
                "parasitic flesh-sacs bobbing in their wake as their visors spew nauseous anti-light that\n" +
                "hurls foes into contraempathic comas. Though each member of an Archon’s Court is\n" +
                "deadly in its own right, it is when these fiends are combined that they become a truly\n" +
                "deadly instrument of their master’s will.",10);
        setInfantry(true);
        setFleet(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
