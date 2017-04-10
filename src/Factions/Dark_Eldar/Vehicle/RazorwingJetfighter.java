package Factions.Dark_Eldar.Vehicle;

import Factions.Dark_Eldar.Base.DarkEldarVehicle;

/**
 * Created by jnebl on 4/10/2017.
 */
public class RazorwingJetfighter extends DarkEldarVehicle{
    public RazorwingJetfighter(){
        super(4,10,10,10,3,"Razorwing Jetfighter","Razorwing Jetfighters " +
                "are so fast that their attack runs seem little more than a\n" +
                "hallucinatory blur of streaking shadow. Yet the carnage they leave in their wake is\n" +
                "breathtakingly real. While Razorwings are well equipped for dogfights, their pilots prefer\n" +
                "to rain death on helpless ground targets. Razorwings are brazen craft specifically\n" +
                "designed to terrify the foe with their screaming approach. Their pilots delight in\n" +
                "executing murderous strafing runs and watching the panicked survivors scatter for\n" +
                "cover. Indeed, more than once, their punishing attack runs have prevented realspace\n" +
                "raids from being overwhelmed by the massed infantry of their foes, swathes of proud\n" +
                "warriors reduced to mangled meat with each bombardment of terrifying monoscythe\n" +
                "missiles.",130);
        setFastAttack(true);
        setFlyer(true);
        setNightVision(true);
        setSupersonic(true);
    }
}
