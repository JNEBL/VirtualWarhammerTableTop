package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class FleshGauntlet extends Weapon{
    private FleshGauntlet(int userStrength){
        super(userStrength,1,0,0,"Flesh Gauntlet","A " +
                "claw-glove crammed with syringe-like protrusions and vials, the flesh gauntlet can\n" +
                "inject potent electrosteroids that force rapid and unnatural growth. Its victim will\n" +
                "literally outgrow his own skin, suffering a truly unpleasant death as he bursts apart in a\n" +
                "welter of steaming, heaving gobs of matter.");
        setLethalDose(true);
        setPoisoned4(true);
    }
}
