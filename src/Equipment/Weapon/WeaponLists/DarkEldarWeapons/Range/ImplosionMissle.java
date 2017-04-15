package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class ImplosionMissle extends Weapon{
    public ImplosionMissle(){
        super(48,6,2,"Implosion Missle","Upon detonation, " +
                "these missiles emit a molecular dissonance field that causes those\n" +
                "caught in their path to implode, instantly collapsing in upon themselves and leaving\n" +
                "nothing more than a scorched silhouette to mark their passage.");
        setAssault(true,1);
        setBlast(true);
        setOneUseOnly(true);
    }
}
