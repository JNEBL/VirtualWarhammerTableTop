package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Dice;
import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class LiquifierGun extends Weapon{
    public LiquifierGun(){
        super(3,0,"Liquifier","The liquifier gun fires a spray of " +
                "incredibly potent acid that eats through anything it\n" +
            "touches. Wracks, Grotesques and other minions of the Haemonculus Covens often have\n" +
            "liquifier guns built into their bodies to that they can fire out great gouts of their own\n" +
            "acidic blood. The amount of devastation wreaked by this fearsome weapon depends on\n" +
            "how much of its vitriolic ammunition splashes over its unfortunate target.");
        setAssault(true,1);
        setApD6(true);
    }
}
