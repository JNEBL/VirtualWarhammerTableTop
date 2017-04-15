package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class HayWireBlaster extends Weapon{
    public HayWireBlaster(){
        super(24,4,4,"Haywire Blaster","Haywire blasters " +
                "are long-barrelled weapons that siphon the electromagnetic energy\n" +
                "crackling around Commorragh’s highest aeries, to later release it in a terrifyingly\n" +
                "powerful burst. A well-aimed haywire blaster can cripple an enemy vehicle’s control\n" +
                "systems in a single shot.");
        setAssault(true,1);
    }
}
