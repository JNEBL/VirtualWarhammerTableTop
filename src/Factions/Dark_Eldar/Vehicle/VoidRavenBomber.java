package Factions.Dark_Eldar.Vehicle;

import Factions.Dark_Eldar.Base.DarkEldarVehicle;

/**
 * Created by jnebl on 4/10/2017.
 */
public class VoidRavenBomber extends DarkEldarVehicle{
    public VoidRavenBomber(){
        super(4,10,10,10,3,"Voidraven Bomber","The Voidraven Bomber " +
                "is the ultimate in Dark Eldar heavy weapons deployment. Its\n" +
                "aerodynamic design and supersonic turn of speed allow it to dance through the sky with\n" +
                "balletic grace, and the Voidraven’s pilot will invariably be a veteran of the death races\n" +
                "around the spires of High Commorragh, thinking nothing of breakneck aerial\n" +
                "manoeuvres that would kill a lesser steersman. Voidravens are invisible to all but the\n" +
                "naked eye and mount complex sonic dampers that completely obscure the sound of its\n" +
                "engines. Sensors and early-warning equipment are rendered useless by a stealth warfare\n" +
                "suite of such potency that the craft might as well be obscured by dark sorcery. Enemy\n" +
                "pilots are equally helpless, their comms filling with panicked shouts as they try to hunt\n" +
                "fast and deadly ghosts that their instruments insist simply do not exist.",160);
        setHeavySupport(true);
        setFlyer(true);
        setNightVision(true);
        setSupersonic(true);
    }
}
