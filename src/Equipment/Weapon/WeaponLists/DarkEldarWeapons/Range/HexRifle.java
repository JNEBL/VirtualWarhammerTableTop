package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class HexRifle extends Weapon{
    public HexRifle(){
        super(36,0,4,"HexRifle","The hexrifle fires " +
                "crystal cylinders containing a tiny sample of the Plague of Glass that\n" +
                "afflicted the Dark City in M36. On contact with bare flesh, the hexrifle’s arcane payload\n" +
                "spreads quickly, turning its victim into a transparent statue with an expression of shock\n" +
                "etched upon its visage forevermore.");
        setAssault(true,1);
        setArcanePayload(true);
        setSniper(true);
    }
}
