package BaseArea;

/**
 * Created by jnebl on 4/9/2017.
 */
public class SpecialRule {
    
    private String name,faction,description;
    public SpecialRule(String name){
        setName(name);
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
}
