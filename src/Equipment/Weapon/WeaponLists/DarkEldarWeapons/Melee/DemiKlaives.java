package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class DemiKlaives extends Weapon{
    public DemiKlaives(int userStrength){
        super(userStrength,1,0,3,"Demiklaives","" +
                "Demiklaives are power weapons that can either be wielded separately for speed, or\n" +
                "clasped together to form a more powerful blade.");
        setDualWield(true);
    }
}
