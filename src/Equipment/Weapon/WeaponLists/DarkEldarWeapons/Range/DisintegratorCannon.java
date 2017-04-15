package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class DisintegratorCannon extends Weapon{
    public DisintegratorCannon(){
        super(36,5,2,"Disintegrator Cannon","The disintegrator " +
                "cannon fires particles of unstable matter harnessed\n from a stolensun, each " +
                "shot capable of atomising the most heavily armoured warrior. Far more\n" +
                "sophisticated than conventional plasma-based firearms, it maintains a high rate of fire\n" +
                "and always remains cool to the touch despite the ravening energies housed within.");
        setHeavy(true,3);
    }
}
