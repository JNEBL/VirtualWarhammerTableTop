package Equipment.Weapon.WeaponLists.DarkEldarWeapons.Range;

import BaseArea.Weapon;

/**
 * Created by jnebl on 4/15/2017.
 */
public class DarkScytheLance extends Weapon{
    public DarkScytheLance(){
        super(24,8,2,"Dark Scythe Lance","The weapon " +
                "shops of Commorragh are infamous for their ability to cheat\n" +
                "the natural laws of physics in order to design ever more efficient and\n" +
                "exciting ways to kill. Blasters and dark lances epitomise this, for they do\n" +
                "not employ standard laser technology but instead fire a stream of what\n" +
                "is, for want of a better term, ‘darklight’. The origin of this substance is\n" +
                "unknown, although there are a number who claim it is sourced from\n" +
                "black holes, warp storms and other celestial phenomena of great\n" +
                "magnitude. Darklight works by reacting catastrophically with its target,\n" +
                "producing a blast that can bore a massive hole in a vehicle regardless of\n" +
                "armour, or vaporise a foot soldier in an instant. Even to perceive a beam\n" +
                "of darklight without the correct protection leaves permanent slash-scars\n" +
                "upon the retina.");
        setHeavy(true,1);
        setBlast(true);
    }
}
