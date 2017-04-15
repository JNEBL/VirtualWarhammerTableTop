package Equipment.Accesor;

import BaseArea.Weapon;
import Equipment.WeaponLists.DarkEldarWeapons.Melee.Agoniser;

/**
 * Created by jnebl on 4/14/2017.
 */
public class WeaponList {
    public static Weapon addAgoniser(int userStrength){
        Weapon weapon = new Agoniser(userStrength);
        return weapon;
    }
}
