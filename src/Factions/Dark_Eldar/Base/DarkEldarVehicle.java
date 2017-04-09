package Factions.Dark_Eldar.Base;

import BaseArea.Vehicle;

/**
 * Created by jnebl on 4/9/2017.
 */
public class DarkEldarVehicle extends Vehicle {
    public DarkEldarVehicle(int BS,int AF,int AS,int AR,int HP,String name,String description,int points){
        super(BS,AF,AS,AR,HP,name,description,points);
        setFaction("Dark Eldar");
    }
}
