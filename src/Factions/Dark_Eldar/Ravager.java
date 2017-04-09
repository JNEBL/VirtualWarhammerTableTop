package Factions.Dark_Eldar;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Ravager extends DarkEldarVehicle {

    public Ravager(){
        super(4,11,11,10,3,"Ravager");
        setDescription("Though it fulfils a similar role to the battle tanks of other races, the Ravager carries\n" +
                "little armour. Instead, Ravagers are so nimble that they can ambush an enemy tank and\n" +
                "destroy it in a single devastating pass, disappearing again before the foe knows what hit\n" +
                "them. Shadows streak suddenly overhead, tanks exploding in gouts of flame as lances of\n" +
                "dark energy tear through their hulls. Defenders scramble to respond, gunfire spitting in\n" +
                "all directions. Panic and confusion spread like a plague, while the Ravagers slip away\n" +
                "ready to attack again elsewhere. In this way enemy strongpoints or tank columns can be\n" +
                "reduced to smouldering wreckage without the cost of a single Dark Eldar life, the dazed\n" +
                "survivors left defenceless as the rest of the raiding party descends.");
        setPoints(110);
    }
}
