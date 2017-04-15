package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class HuskBlade extends Weapon{
    public HuskBlade(int userStrength){
        super(userStrength,1,0,3,"HuskBlade","Leaving " +
                "smoking trails as it carves through the air, a huskblade instantly evaporates\n" +
                "the moisture in anything it touches, reducing targets to shrivelled and gruesome corpses\n" +
                "that fall away to dust on the breeze.");
        setInstantDeath(true);
    }
}
