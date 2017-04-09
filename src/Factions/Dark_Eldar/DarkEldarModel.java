package Factions.Dark_Eldar;

import BaseArea.Model;

/**
 * Created by jnebl on 4/9/2017.
 */
public class DarkEldarModel extends Model{
    public DarkEldarModel(int WS, int BS, int S, int T, int W, int I, int A, int LD, int SV, String name){
        super(WS,BS,S,T,W,I,A,LD,SV,name);
        setFaction("Dark Eldar");
    }

}
