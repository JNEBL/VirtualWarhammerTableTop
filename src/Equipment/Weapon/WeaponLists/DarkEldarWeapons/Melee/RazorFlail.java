package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class RazorFlail extends Weapon{
    public RazorFlail(int userStrength){
        super(userStrength,1,0,5,"RazorFlail","" +
                "Razorflails are wielded as a twinned pair of blades that at first glance resemble long,\n" +
                "flimsy and unwieldy swords. Yet with a single flick of the wrist each can split apart and\n" +
                "lash out like a whip, their whistling blades almost impossible to block or parry.");
        setBladeWhip(true);
        setSpecialistWeapon(true);
    }
}
