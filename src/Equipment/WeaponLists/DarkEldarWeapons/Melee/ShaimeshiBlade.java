package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class ShaimeshiBlade extends Weapon{
    public ShaimeshiBlade(int userStrength){
        super(userStrength,1,0,0,"Shaimeshi Blade","" +
                "Whether elegant short sword, curved dagger or even barbed hair pin, the core of each\n" +
                "Shaimeshi blade is shot through with reservoirs of breathtakingly lethal poisons, while its\n" +
                "surface is riddled with microscopic vents through which these venoms can flow. With\n" +
                "each graceful swing or lightning fast stab, it parts flesh to vent its poisons where they can\n" +
                "do the most harm.");
        setLethalDose(true);
        setPoisoned2(true);
    }
}
