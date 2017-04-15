package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class ArchiteGlaiveDoubleHanded extends Weapon{
    public ArchiteGlaiveDoubleHanded(int userStrength){
        super(userStrength,1,1,2,"Archite Glaive","These " +
                "power glaives are exquisitely crafted pole-arms employed to lethal effect by\n" +
                "Succubi in both the gladiatorial arenas of Commorragh and the battlefields of realspace.\n" +
                "They can be wielded with both hands, to bisect a foe with ease, or used in combination\n" +
                "with another weapon to cut through a host of victims");
        setTwoHanded(true);
    }
}
