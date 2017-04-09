package BaseArea;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Vehicle extends SpecialRule {
    private int ballisticSkill,armourValueFront,armourValueSides,armourValueRear,hullPoints,points;
    private boolean chariot = false,fast = false,flyer = false,heavy = false,hover = false,openTopped = false
            ,skimmer = false,tank = false,transport = false,walker = false,
            superHeavyWalker = false,superHeavyFlyer = false;
    public Vehicle(int BS,int AF,int AS,int AR,int HP,String name){
        super(name);
        setBallisticSkill(BS);
        setArmourValueFront(AF);
        setArmourValueSides(AS);
        setArmourValueRear(AR);
        setHullPoints(HP);
    }

    public int getBallisticSkill() {
        return ballisticSkill;
    }
    public void setBallisticSkill(int ballisticSkill) {
        if (ballisticSkill <= 10 && ballisticSkill >= 0)
            this.ballisticSkill = ballisticSkill;
        else if (ballisticSkill > 10)
            this.ballisticSkill = 10;
        else
            this.ballisticSkill = 0;
    }
    public void incrementAddBallisticSkill(int ballisticSkill){
        setBallisticSkill(this.ballisticSkill + ballisticSkill);
    }
    public void incrementSubtractBallisticSkill(int ballisticSkill){
        setBallisticSkill(this.ballisticSkill - ballisticSkill);
    }
    public void incrementMultipleBallisticSkill(int ballisticSkill){
        setBallisticSkill((int)(this.ballisticSkill * ballisticSkill));
    }

    public int getArmourValueFront() {
        return armourValueFront;
    }
    public void setArmourValueFront(int armourValueFront) {
        if (armourValueFront <= 14 && armourValueFront >= 10)
            this.armourValueFront = armourValueFront;
        else if (armourValueFront > 14)
            this.armourValueFront = 14;
        else
            this.armourValueFront = 10;
    }

    public int getArmourValueRear() {
        return armourValueRear;
    }
    public void setArmourValueRear(int armourValueRear) {
        if (armourValueRear <= 14 && armourValueRear >= 10)
            this.armourValueRear = armourValueRear;
        else if (armourValueRear > 14)
            this.armourValueRear = 14;
        else
            this.armourValueRear = 10;
    }

    public int getArmourValueSides() {
        return armourValueSides;
    }
    public void setArmourValueSides(int armourValueSides) {
        if (armourValueSides <= 14 && armourValueSides >= 10)
            this.armourValueSides = armourValueSides;
        else if (armourValueSides > 14)
            this.armourValueSides = 14;
        else
            this.armourValueSides = 10;
    }

    public int getHullPoints() {
        return hullPoints;
    }
    public void setHullPoints(int hullPoints) {
        this.hullPoints = hullPoints;
    }
    public void incrementAddHullPoints(int hullPoints){
        setHullPoints(this.hullPoints + hullPoints);
    }
    public void incrementSubtractHullPoints(int hullPoints){
        setHullPoints(this.hullPoints - hullPoints);
    }
    public void incrementMultipleHullPoints(int hullPoints){
        setHullPoints((int)(this.hullPoints * hullPoints));
    }

    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        if (points >= 0 )
            this.points = points;
        else
            this.points = 0;
    }
    public void incrementAddPoints(int points){
        setPoints(this.points + points);
    }
    public void incrementSubtractPoints(int points){
        setPoints(this.points - points);
    }
    public void incrementMultiplePoints(int points){
        setPoints((int)(this.points * points));
    }


    public boolean isChariot() {
        return chariot;
    }
    public void setChariot(boolean chariot) {
        this.chariot = chariot;
    }

    public boolean isFast() {
        return fast;
    }
    public void setFast(boolean fast) {
        this.fast = fast;
    }

    public boolean isFlyer() {
        return flyer;
    }
    public void setFlyer(boolean flyer) {
        this.flyer = flyer;
    }

    public boolean isHeavy() {
        return heavy;
    }
    public void setHeavy(boolean heavy) {
        this.heavy = heavy;
    }

    public boolean isHover() {
        return hover;
    }
    public void setHover(boolean hover) {
        this.hover = hover;
    }

    public boolean isOpenTopped() {
        return openTopped;
    }
    public void setOpenTopped(boolean openTopped) {
        this.openTopped = openTopped;
    }

    public boolean isSkimmer() {
        return skimmer;
    }
    public void setSkimmer(boolean skimmer) {
        this.skimmer = skimmer;
    }

    public boolean isSuperHeavyFlyer() {
        return superHeavyFlyer;
    }
    public void setSuperHeavyFlyer(boolean superHeavyFlyer) {
        this.superHeavyFlyer = superHeavyFlyer;
    }

    public boolean isSuperHeavyWalker() {
        return superHeavyWalker;
    }
    public void setSuperHeavyWalker(boolean superHeavyWalker) {
        this.superHeavyWalker = superHeavyWalker;
    }

    public boolean isTank() {
        return tank;
    }
    public void setTank(boolean tank) {
        this.tank = tank;
    }

    public boolean isTransport() {
        return transport;
    }
    public void setTransport(boolean transport) {
        this.transport = transport;
    }

    public boolean isWalker() {
        return walker;
    }
    public void setWalker(boolean walker) {
        this.walker = walker;
    }


    @Override
    public String toString() {
        return getFaction() + " " + getName() + "\nBS AF AS AR HP\n" + getBallisticSkill() + "  " +
                getArmourValueFront() + " " + getArmourValueSides() + " " + getArmourValueRear() + " " +
                getHullPoints() + "\n" + getDescription();
    }
}
