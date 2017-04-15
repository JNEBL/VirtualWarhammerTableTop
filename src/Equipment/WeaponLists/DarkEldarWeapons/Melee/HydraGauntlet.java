package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class HydraGauntlet extends Weapon{
    public HydraGauntlet(int userStrength){
        super(userStrength,1,0,5,"Hydra Gauntlet","Hydra " +
                "gauntlets are made from a flexible weave of semi-sentient, extraplanar crystal.\n" +
                "Smooth and glassy when inert, a hydra gauntlet can be compelled by a strong-willed\n" +
                "wearer to sprout and regrow an impossible profusion of lethal crystalline blades.");
        setShred(true);
        setSpecialistWeapon(true);
    }
}
