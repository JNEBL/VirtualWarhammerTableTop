package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class EyeBurst extends Weapon{
    public EyeBurst(){
        super(4,3,"EyeBurst","A Medusae can open its host’s steel " +
                "visor and paralyse those under its gaze with a\n" +
                "wave of raw anguish, plunging them into a coma from which there is no recovery.");
        setAssault(true,1);
    }
}
