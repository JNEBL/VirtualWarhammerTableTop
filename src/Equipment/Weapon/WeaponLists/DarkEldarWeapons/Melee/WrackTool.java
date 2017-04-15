package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class WrackTool extends Weapon{
    public WrackTool(int userStrength){
        super(userStrength,1,0,0,"Wrack Tool","Wracks " +
                "wield a sickening variety of sickle-blades, saws, knives and mauls into battle,\n" +
                "all of which are coated in searing venom");
        setPoisoned(true,4);
    }
}
