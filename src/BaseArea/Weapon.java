package BaseArea;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Weapon extends SpecialRule{
    private int range,strength,armourPiercing;
    private int strengthMultiple,strengthIncrement;
    private boolean melee,twoHanded,dualWield;
    private boolean poisoned2,poisoned4,poisoned5,shred,concussive,lethalDose,instantDeath,specialistWeapon,fleshBane,bladeWhip,
            rending,impale,ritualPair,snatched;
    public Weapon(int range,int strength,int armourPiercing,String name,String description){
        super(name,description);
        setRange(range);
        setStrength(strength);
        setArmourPiercing(armourPiercing);
    }
    public Weapon(int userStrength,int strengthMultiple,int strengthIncrement,int armourPiercing,String name,String description){
        super(name,description);
        setMelee(true);
        setStrength(userStrength);
        incrementMultipleStrength(strengthMultiple);
        incrementAddStrength(strengthIncrement);
        setArmourPiercing(armourPiercing);
        this.strengthIncrement = strengthIncrement;
        this.strengthMultiple = strengthMultiple;
    }

    public int getRange() {
        return range;
    }
    public void setRange(int range) {
        this.range = range;
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void incrementAddStrength(int strength){
        setStrength(this.strength + strength);
    }
    public void incrementSubtractStrength(int strength){
        setStrength(this.strength - strength);
    }
    public void incrementMultipleStrength(int strength){
        setStrength((int)(this.strength * strength));
    }
    public void resetStrength(int userStrength){
        setStrength(userStrength);
        incrementMultipleStrength(strengthMultiple);
        incrementAddStrength(strengthIncrement);
    }

    public int getArmourPiercing() {
        return armourPiercing;
    }
    public void setArmourPiercing(int armourPiercing) {
        this.armourPiercing = armourPiercing;
    }

    public boolean isMelee() {
        return melee;
    }
    public void setMelee(boolean melee) {
        this.melee = melee;
    }

    public boolean isTwoHanded() {
        return twoHanded;
    }
    public void setTwoHanded(boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public boolean isDualWield() {
        return dualWield;
    }
    public void setDualWield(boolean dualWield) {
        this.dualWield = dualWield;
    }

    public boolean isPoisoned2() {
        return poisoned2;
    }
    public void setPoisoned2(boolean poisoned2) {
        this.poisoned2 = poisoned2;
    }

    public boolean isPoisoned4() {
        return poisoned4;
    }
    public void setPoisoned4(boolean poisoned4) {
        this.poisoned4 = poisoned4;
    }

    public boolean isPoisoned5() {
        return poisoned5;
    }
    public void setPoisoned5(boolean poisoned5) {
        this.poisoned5 = poisoned5;
    }

    public boolean isShred() {
        return shred;
    }
    public void setShred(boolean shred) {
        this.shred = shred;
    }

    public boolean isConcussive() {
        return concussive;
    }
    public void setConcussive(boolean concussive) {
        this.concussive = concussive;
    }

    public boolean isLethalDose() {
        return lethalDose;
    }
    public void setLethalDose(boolean lethalDose) {
        this.lethalDose = lethalDose;
    }

    public boolean isInstantDeath() {
        return instantDeath;
    }
    public void setInstantDeath(boolean instantDeath) {
        this.instantDeath = instantDeath;
    }

    public boolean isSpecialistWeapon() {
        return specialistWeapon;
    }
    public void setSpecialistWeapon(boolean specialistWeapon) {
        this.specialistWeapon = specialistWeapon;
    }

    public boolean isFleshBane() {
        return fleshBane;
    }
    public void setFleshBane(boolean fleshBane) {
        this.fleshBane = fleshBane;
    }

    public boolean isBladeWhip() {
        return bladeWhip;
    }
    public void setBladeWhip(boolean bladeWhip) {
        this.bladeWhip = bladeWhip;
    }

    public boolean isRending() {
        return rending;
    }
    public void setRending(boolean rending) {
        this.rending = rending;
    }

    public boolean isImpale() {
        return impale;
    }
    public void setImpale(boolean impale) {
        this.impale = impale;
    }

    public boolean isRitualPair() {
        return ritualPair;
    }
    public void setRitualPair(boolean ritualPair) {
        this.ritualPair = ritualPair;
    }

    public boolean isSnatched() {
        return snatched;
    }
    public void setSnatched(boolean snatched) {
        this.snatched = snatched;
    }
}
