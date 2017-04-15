package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Melee;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/14/2017.
 */
public class StunClaw extends Weapon{
    public StunClaw(int userStrength){
        super(userStrength,1,1,6,"StunClaw","" +
                "Stunclaws are viciously barbed grapnels, often attached to lengthy metal chains. In\n" +
                "battle a stunclaw can be anchored in the armour or flesh of a luckless victim, who is then\n" +
                "hoisted agonisingly aloft and borne away amid a flock of jeering Hellions, either to a\n" +
                "horrible and bloody fate at the end of the Hellions’ blades, or a brief and violent death by\n" +
                "virtue of simply being dropped from a great height");
        setSnatched(true);
    }
}
