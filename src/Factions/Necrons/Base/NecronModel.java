package Factions.Necrons.Base;

import BaseArea.Model;
import com.sun.javafx.sg.prism.NGShape;

/**
 * Created by jnebl on 4/10/2017.
 */
public class NecronModel extends Model{
    private boolean reanimationProtocols = false,livingMetal = false;
    public NecronModel(int WS,int BS,int S,int T,int W,int I,int A,int LD,int SV,String name, String description,int points){
        super(WS,BS,S,T,W,I,A,LD,SV,name,description,points);
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
