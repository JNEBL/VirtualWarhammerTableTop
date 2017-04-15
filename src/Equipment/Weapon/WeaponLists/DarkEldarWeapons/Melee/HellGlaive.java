package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class HellGlaive extends Weapon{
    public HellGlaive(int userStrength){
        super(userStrength,1,1,5,"Hellglaive","A " +
                "hellglaive is a lightweight, twin-bladed halberd. Though it requires some effort to\n" +
                "master, this weapon can spin and block like a stave, cut like a scythe, or impale like a\n" +
                "barbed spear. From the back of a Hellion skyboard such a weapon can prove especially\n" +
                "lethal, lopping off heads and severing limbs with every blow.");
        setTwoHanded(true);
    }
}
