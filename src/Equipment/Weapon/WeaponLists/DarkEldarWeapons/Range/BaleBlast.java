package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class BaleBlast extends Weapon{
    public BaleBlast(){
        super(18,4,4,"Baleblast","Mandrakes can " +
                "channel the energies stolen from their prey into blasts of freezing\n" +
                "flame, wreathing their victims in spectral fires that burn through flesh and soul alike.");
        setAssault(true,2);
        setSoulBlaze(true);
    }
}
