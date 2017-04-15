package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class ScissorHand extends Weapon{
    public ScissorHand(int userStrength){
        super(userStrength,1,0,5,"Scissorhand","The " +
                "scissorhand looks a little like a pair of surgical shears, and harbours expensive\n" +
                "toxins so that its wielder might better incapacitate those whose limbs it amputates.");
        setPoisoned4(true);
        setRending(true);
    }
}
