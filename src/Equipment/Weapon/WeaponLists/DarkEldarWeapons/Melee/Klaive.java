package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class Klaive extends Weapon{
    public  Klaive(int userStrength){
        super(userStrength,1,1,2,"Klaive","Klaives " +
                "are massive ritual powerblades of brutal aspect. Shimmering with dark\n" +
                "energy, these weapons are impossibly light for their size and can slice through the\n" +
                "thickest armour and toughest flesh with insulting ease.");
        setTwoHanded(true);
    }
}
