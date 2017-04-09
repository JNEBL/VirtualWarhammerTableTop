package BaseArea;

/**
 * Created by jnebl on 4/9/2017.
 */
public class SpecialRule {
    private boolean blind = false,deepStrike = false,fear = false,fleet = false,fleshBane = false,force = false,
            hitAndRun = false,infiltrate = false,itWillNotDie = false,nightVision = false, missileLock = false,
            outFlank = false, psyker = false,shred = false,shrouded = false,scout = false,skilledRider = false,
            slowAndPurposeful = false,splitFire = false,stealth = false, strikeDown = false,stubborn = false,
            swarms = false,tankHunters = false,vectorDancer = false,vortex = false,zealot = false;
    private String name,faction,description;
    public SpecialRule(String name,String description){
        setName(name);
        setDescription(description);
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getFaction() {
        return faction;
    }
    public void setFaction(String faction) {
        this.faction = faction;
    }

    public boolean isFleet() {
        return fleet;
    }
    public void setFleet(boolean fleet) {
        this.fleet = fleet;
    }

    public boolean isFear() {
        return fear;
    }
    public void setFear(boolean fear) {
        this.fear = fear;
    }

    public boolean isNightVision() {
        return nightVision;
    }
    public void setNightVision(boolean nightVision) {
        this.nightVision = nightVision;
    }

}