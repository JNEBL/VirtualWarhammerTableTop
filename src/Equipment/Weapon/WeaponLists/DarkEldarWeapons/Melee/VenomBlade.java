package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class VenomBlade extends Weapon{
    public VenomBlade(int userStrength){
        super(userStrength,1,0,0,"Venom Blade","A " +
                "venom blade has thousands of micropores that constantly exude a distilled elixir of\n" +
                "deadly hypertoxin – one of the most poisonous substances in the galaxy.");
        setPoisoned(true,2);
    }
}
