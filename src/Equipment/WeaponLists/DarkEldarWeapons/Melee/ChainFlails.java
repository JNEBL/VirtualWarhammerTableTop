package Equipment.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class ChainFlails extends Weapon{
    public ChainFlails(int userStrength){
        super(userStrength,1,0,0,"Chain-Flails","" +
                "Chain-flails consist of lengths of barbed chain wound tight under gravitic pressure.\n" +
                "As a Talos glides into battle, these chains are loosed, hurtling from their housings to lash\n" +
                "around wildly. As their barbs find purchase in flesh, the chains’ grav-winches re-engage,\n" +
                "reeling in at lightning speed to snap bones and tear bodies asunder.");
        setShred(true);
    }
}
