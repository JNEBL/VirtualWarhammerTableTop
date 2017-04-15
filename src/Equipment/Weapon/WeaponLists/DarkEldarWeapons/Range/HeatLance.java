package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class HeatLance extends Weapon{
    public HeatLance(){
        super(18,6,1,"Heat Lance","The heat " +
                "lance combines melta and high-yield las technology into a weapon that has\n" +
                "both surprising reach and extreme destructive potential.");
        setAssault(true,1);
        setLance(true);
        setMelta(true);
    }
}
