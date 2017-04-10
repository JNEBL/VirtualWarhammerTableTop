package Factions.Necrons.Base;

import BaseArea.Vehicle;

/**
 * Created by jnebl on 4/10/2017.
 */
public class NecronVehicle extends Vehicle{
    private boolean reanimationProtocols = false,livingMetal = false;
    public NecronVehicle(int BS,int AF,int AS,int AR,int HP,String name,String description,int points){
        super(BS,AF,AS,AR,HP,name,description,points);
        setFaction("Necron");
    }

    public boolean isReanimationProtocols() {
        return reanimationProtocols;
    }
    public void setReanimationProtocols(boolean reanimationProtocols) {
        this.reanimationProtocols = reanimationProtocols;
    }

    public boolean isLivingMetal() {
        return livingMetal;
    }
    public void setLivingMetal(boolean livingMetal) {
        this.livingMetal = livingMetal;
    }
}
