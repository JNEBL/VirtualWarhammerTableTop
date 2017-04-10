package Factions.Dark_Eldar.Model.Scourges;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/10/2017.
 */
public class Scourge extends DarkEldarModel{
    public Scourge(){
        super(4,4,3,3,1,5,1,8,4,"Scourge","The winged " +
                "mercenaries known as Scourges are masters of the Dark City’s skies.\n" +
                "Their deadly flocks soar silently between the jagged minarets and towering pinnacles of\n" +
                "their domain, flame-wracked clouds swirling in their wake. Hopelessly enamoured of\n" +
                "their own avian lethality, the Scourges relish the gory feasts of full-scale war. Yet they\n" +
                "prefer to engage the foe at range, for they are vain and protective of their expensively\n" +
                "altered bodies. Scourges therefore arm themselves with the finest in lightweight but\n" +
                "powerful weaponry that the workshops of the Undercore can provide. These they use to\n" +
                "lay down punishing salvoes of firepower, drinking in the screams of their enemies with\n" +
                "sharpened senses before redeploying and striking again.",16);
        setFastAttack(true);
        setJumpUnits(true);
        setInfantry(true);
        setFleet(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
