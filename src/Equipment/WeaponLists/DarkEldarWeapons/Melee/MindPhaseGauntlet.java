package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class MindPhaseGauntlet extends Weapon{
    public MindPhaseGauntlet(int userStrength){
        super(userStrength,1,0,0,"MindPhase Gauntlet","" +
                "The mindphase gauntlet is an advanced neural controller that saps both strength and\n" +
                "will. It can stop a rampaging foe in his tracks with a single touch, leaving him\n" +
                " glassyeyed and shuddering with overwhelming fatigue.");
        setConcussive(true);
    }
}
