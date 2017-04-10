package Factions.Dark_Eldar.Model.Hellions;

import Factions.Dark_Eldar.Base.DarkEldarModel;

/**
 * Created by jnebl on 4/10/2017.
 */
public class Helliarch extends DarkEldarModel{
    public Helliarch(){
        super(4,4,3,3,1,6,2,9,5,"Helliarch","Hellions are feral " +
                "warriors who ride bladed anti-grav skyboards, and gather into\n" +
                "great swarming gangs to join realspace raids en masse. They are outcasts all, whether\n" +
                "juveniles who have not yet proven themselves worthy of membership within a Kabal, or\n" +
                "those exiles who were already Kabalites but deserted or were driven out. Territorial,\n" +
                "disdainful, and indiscriminately violent, Hellions resent all those who flaunt privilege\n" +
                "and status. For the sheer thrill of it, they take combat drugs that enhance their reactions\n" +
                "until their reflexes are as sharp as their artfully filed teeth. In battle they wield their\n" +
                "hellglaives with such skill that they can hook them around almost any obstruction to\n" +
                "perform suicidally sharp turns, or ‘call’ specific body parts to lop off before hurtling\n" +
                "through the enemy ranks and claiming their gory trophies",23);
        setFastAttack(true);
        setJumpUnits(true);
        setInfantry(true);
        setCharacters(true);
        setCombatDrug(true);
        setFleet(true);
        setHitAndRun(true);
        setNightVision(true);
        setPowerFromPain(true);
    }
}
