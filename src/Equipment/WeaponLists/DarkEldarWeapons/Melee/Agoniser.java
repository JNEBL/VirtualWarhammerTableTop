package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class Agoniser extends Weapon{
    public Agoniser(int userStrength){
        super(userStrength,1,0,3,"Agoniser","An " +
                "agoniser is an extremely sophisticated weapon that drives a victim’s sensorium\n" +
                "haywire, causing excruciatingly severe pain as nerves burn out from overload. Though\n" +
                "agonisers come in a variety of forms, the most common are toxin-soaked whips.");
        setPoisoned4(true);
    }
}
