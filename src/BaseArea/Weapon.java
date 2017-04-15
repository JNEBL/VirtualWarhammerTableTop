package BaseArea;

/**
 * Created by jnebl on 4/9/2017.
 */
public class Weapon extends SpecialRule{
    private int range,strength,armourPiercing;
    private int strengthMultiple,strengthIncrement;
    private boolean apD6;
    private boolean melee,twoHanded,dualWield,assault,pistol,heavy,template;
    private boolean poisoned,shred,concussive,lethalDose,instantDeath,specialistWeapon,fleshBane,bladeWhip,soulBlaze,
            rending,impale,ritualPair,snatched,lance,blast,haywire,melta,sniper,arcanePayload,oneUseOnly;
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
    public Weapon(int strength,int armourPiercing,String name,String description){
        super(name,description);
        setStrength(strength);
        setArmourPiercing(armourPiercing);
        setTemplate(true);
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

    public boolean isApD6() {
        return apD6;
    }
    public void setApD6(boolean apD6) {
        this.apD6 = apD6;
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

    public boolean isAssault() {
        return assault;
    }
    public void setAssault(boolean assault,int number) {
        this.assault = assault;
    }

    public boolean isPistol() {
        return pistol;
    }
    public void setPistol(boolean pistol) {
        this.pistol = pistol;
    }

    public boolean isHeavy() {
        return heavy;
    }
    public void setHeavy(boolean heavy,int number) {
        this.heavy = heavy;
    }

    public boolean isTemplate() {
        return template;
    }
    public void setTemplate(boolean template) {
        this.template = template;
    }

    public boolean isPoisoned() {
        return poisoned;
    }
    public void setPoisoned(boolean poisoned,int number) {
        this.poisoned = poisoned;
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

    public boolean isSoulBlaze() {
        return soulBlaze;
    }
    public void setSoulBlaze(boolean soulBlaze) {
        this.soulBlaze = soulBlaze;
    }

    public boolean isLance() {
        return lance;
    }
    public void setLance(boolean lance) {
        this.lance = lance;
    }

    public boolean isBlast() {
        return blast;
    }
    public void setBlast(boolean blast) {
        this.blast = blast;
    }

    public boolean isHaywire() {
        return haywire;
    }
    public void setHaywire(boolean haywire) {
        this.haywire = haywire;
    }

    public boolean isMelta() {
        return melta;
    }
    public void setMelta(boolean melta) {
        this.melta = melta;
    }

    public boolean isSniper() {
        return sniper;
    }
    public void setSniper(boolean sniper) {
        this.sniper = sniper;
    }

    public boolean isArcanePayload() {
        return arcanePayload;
    }
    public void setArcanePayload(boolean arcanePayload) {
        this.arcanePayload = arcanePayload;
    }

    public boolean isOneUseOnly() {
        return oneUseOnly;
    }
    public void setOneUseOnly(boolean oneUseOnly) {
        this.oneUseOnly = oneUseOnly;
    }
}
