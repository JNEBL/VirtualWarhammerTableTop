package Factions.Dark_Eldar.Vehicle;

import Factions.Dark_Eldar.Base.DarkEldarVehicle;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Venom extends DarkEldarVehicle{
    public Venom(){
        super(4,10,10,10,2,"Venom","Dark Eldar raids rely " +
                "heavily on surprise and raw speed – qualities that are\n" +
                "embodied by the Venom. Rather than present a single obvious target, a Dark Eldar raid\n" +
                "attacks in a malignant swarm in order to confound the guns of the foe. During such\n" +
                "attacks, it is the largest craft that bear the brunt of enemy fire. The most devious Dark\n" +
                "Eldar therefore ride to war mounted upon Venoms. Should even a single such craft\n" +
                "penetrate the enemy defences it can be enough to sow the seeds of destruction, laying\n" +
                "down supporting fire as its lethal cargo goes to work. The best Venom pilots use the\n" +
                "Raiders of their erstwhile comrades for cover, darting between them at breakneck speeds\n" +
                "as they close on the foe. This makes Venoms especially popular with the aristocratic\n" +
                "Trueborn, who think nothing of allowing their half-breed kin to soak up enemy fire\n" +
                "intended for them.",55);
        setFastAttack(true);
        setSkimmer(true);
        setFast(true);
        setOpenTopped(true);
        setTransport(true);
        setDeepStrike(true);
        setNightVision(true);
    }
}
