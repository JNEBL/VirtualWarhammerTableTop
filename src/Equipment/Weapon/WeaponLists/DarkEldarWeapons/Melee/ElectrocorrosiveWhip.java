package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class ElectrocorrosiveWhip extends Weapon{
    public ElectrocorrosiveWhip(int userStrength){
        super(userStrength,1,0,3,"Electrocorrosive Whip","" +
                "An electrocorrosive whip is a lashing tongue of venom-coated polymer with a highyield dynamo in its \n" +
                "hilt. Its touch is painful and debilitating in the extreme, sapping the\n" +
                "strength of its victim and robbing them of the will to fight.");
        setConcussive(true);
        setPoisoned(true,5);
    }
}
