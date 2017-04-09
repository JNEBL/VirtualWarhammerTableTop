package Factions.Dark_Eldar.Model;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Succubus extends DarkEldarModel {
    public Succubus(){
        super(8,6,3,3,3,8,4,9,6,"Succubus","The Succubi are the " +
                "ruling elite of the Wych Cults. They are impossibly lithe,\n" +
                "famously beautiful, and utterly deadly. Collectively known as the ynnitach or ‘brides of\n" +
                "death’, a council of three such queens of murder traditionally rules over each Cult.\n" +
                "Competition between these hellcats is fierce, as they strive to outdo one another with\n" +
                "spectacles of violent excess. Unlike the immortal games of the Archons, the queens of the\n" +
                "Wych Cults are far more likely to resolve their feuds with a perfectly-executed\n" +
                "decapitation than with a twist of the political knife. Succubi are ravishing in their beauty,\n" +
                "their supple alabaster flesh clasped within bladed corsets and high-necked skinsuits of\n" +
                "liquid silk, and their sinuous, serpentine grace is almost hypnotic. The arena’s crowd\n" +
                "demands not only a bloody spectacle but also one that is pleasing to the most jaded eye.\n" +
                "Thus a Succubus will do almost anything to preserve her appearance, including putting\n" +
                "dozens of lesser warriors to death and feeding on their last gasps of anguish to maintain\n" +
                "a youthful sheen. No Succubus is secure in her position without constant proof of her\n" +
                "skill. They regularly take the lead in realspace raids, not only for the feast of pain but\n" +
                "also to hunt the champions of lesser races and defeat them in showy displays of their\n" +
                "sheer skill.",75);
        setHq(true);
        setInfantry(true);
        setCharacters(true);
        setCombatDrug(true);
        setIndependentCharacter(true);
        setFleet(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
