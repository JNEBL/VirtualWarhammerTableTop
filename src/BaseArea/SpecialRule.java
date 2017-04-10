package BaseArea;

/**
 * Created by jnebl on 4/9/2017.
 */
public class SpecialRule {

    private String name,description;
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
}
