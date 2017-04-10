package Factions.Dark_Eldar.Model.Wyches;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Hekatrix extends DarkEldarModel {
    public Hekatrix(){
        super(4,4,3,3,1,6,2,9,6,"Hekatrix","The nightly battles " +
                "between the gladiatrixes of the Wych Cults draw baying crowds to\n" +
                "every Commorrite arena. Wyches – or ‘Hekatarii’ – wield a variety of outlandish\n" +
                "weapons that can whip out, extend, enmesh, retract, split in two, or snap an opponent’s\n" +
                "blade with the twist of a supple wrist. Some Wyches – such as the Lacerai, Hydrae, and\n" +
                "Yraqnae – specialise in such deadly esoterica. Furthermore, all Wyches are skilled knifefighters \n" +
                "who can kill a foe many times their size with the smallest of blades. The Wyches\n" +
                "use a variety of combat drugs, galvanising them to ever-greater heights of balletic\n" +
                "dexterity. They flip and pirouette around their enemies, slicing open a throat here and\n" +
                "piercing a heart there. The Wyches flow through the elegant steps of battle, expressions\n" +
                "of disdain twisting into savage smiles as they feed upon each fresh scream of pain.",20);
        setTroops(true);
        setInfantry(true);
        setCharacters(true);
        setCombatDrug(true);
        setFleet(true);
        setNightVision(true);
        setPowerFromPain(true);
        setDodge(true);
    }
}
