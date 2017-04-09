package Factions.Dark_Eldar.Base;

import BaseArea.Model;

/**
 * Created by jnebl on 4/9/2017.
 */
public class DarkEldarModel extends Model{
    public boolean combatDrug = false,powerFromPain = false;
    public DarkEldarModel(int WS,int BS,int S,int T,int W,int I,int A,int LD,int SV,String name, String description,int points){
        super(WS,BS,S,T,W,I,A,LD,SV,name,description,points);
        setFaction("Dark Eldar");
    }

    public boolean isCombatDrug() {
        return combatDrug;
    }
    public void setCombatDrug(boolean combatDrug) {
        this.combatDrug = combatDrug;
    }

    public boolean isPowerFromPain() {
        return powerFromPain;
    }
    public void setPowerFromPain(boolean powerFromPain) {
        this.powerFromPain = powerFromPain;
    }
}
