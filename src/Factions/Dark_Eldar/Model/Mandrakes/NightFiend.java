package Factions.Dark_Eldar.Model.Mandrakes;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class NightFiend extends DarkEldarModel {
    public NightFiend(){
        super(4,4,4,3,1,5,3,9,7,"Nightfiend","Within the realm of " +
                "Aelindrach lurk the Mandrake, vile terrors that can pull\n" +
                "themselves into reality through another being’s shadow. Their inky skin writhes with\n" +
                "forbidden runes, and their faces shift and flow; one moment sealing over in an\n" +
                "expressionless mask, the next parting like a wound filled with needle teeth. It is said thatonce a \n" +
                "Mandrake has chosen its prey, nothing stays its inexorable pursuit, and no\n" +
                "barrier will hold it back. Mandrake on the hunt are silent but for the occasional ragged\n" +
                "gasp or hiss. Their violent onset is heralded by a thin rime of creeping ice and a susurrus\n" +
                "of half-heard whispers. When Mandrake fall upon their victims they do so in a sudden\n" +
                "explosion of ferocity, sinuous stealth cast aside in favour of piercing screams and the\n" +
                "maddened hacking of flesh with grossly out-sized surgical blades.",22);
        setElites(true);
        setInfantry(true);
        setCharacters(true);
        setFear(true);
        setFleet(true);
        setInfiltrate(true);
        setMoveThroughCover(true);
        setNightVision(true);
        setPowerFromPain(true);
        setShrouded(true);
        setStealth(true);
    }
}
