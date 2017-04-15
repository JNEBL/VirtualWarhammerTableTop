package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class IchorInjector extends Weapon{
    public IchorInjector(int userStrength){
        super(userStrength,1,0,0,"Ichor Injector","This " +
                "device injects its targets with the noxious ichor of the wielder’s own\n" +
                "bloodstream. Its victims boil alive from the inside out, while foul, steaming fluids bubble\n" +
                "from their mouths and eye sockets.");
        setFleshBane(true);
        setLethalDose(true);
    }
}
