package BaseArea;

import java.util.ArrayList;

/**
 * Created by jnebl on 4/6/2017.
 */
public class Model extends AllModels{
    ArrayList<Weapon> weapons = new ArrayList<>();
    private int weaponSkill,ballisticSkill,strength,toughness,wound,initiative,attack,leadership,armourSave;
    private boolean feelNoPain = false,furiousCharge = false,rampage = false,independentCharacter = false,dodge = false,
            infiltrate = false,moveThroughCover = false,shrouded = false,stealth = false,bulky = false,daemon = false,
            rending = false,swarms = false,rage = false,hitAndRun = false,skilledRider,fearless = false;
    private boolean characters = false,infantry = false,bikesAndJetBikes = false,artillery = false,jumpUnits = false,
            jetPackUnits = false,beasts = false,cavalry = false,monstrousCreatures = false,eldarJetBikes = false,
            flyingMonstrousCreatures = false,gargantuan = false,flyingGargantuanCreature = false;
    public Model(int WS,int BS,int S,int T,int W,int I,int A,int LD,int SV,String name,String description,int points){
        super(name,description,points);
        setWeaponSkill(WS);
        setBallisticSkill(BS);
        setStrength(S);
        setToughness(T);
        setWound(W);
        setInitiative(I);
        setAttack(A);
        setLeadership(LD);
        setArmourSave(SV);
    }

    public int getArmourSave() {
        return armourSave;
    }
    public void setArmourSave(int armourSave) {
        if (armourSave >= 2)
            this.armourSave = armourSave;
        else
            this.armourSave = 2;
    }
    public void incrementAddArmourSave(int armourSave){
        setArmourSave(this.armourSave + armourSave);
    }
    public void incrementSubtractArmourSave(int armourSave){
        setArmourSave(this.armourSave - armourSave);
    }
    public void incrementMultipleArmourSave(int armourSave){
        setArmourSave((int)(this.armourSave + armourSave));
    }

    public int getAttack() {
        return attack;
    }
    public void setAttack(int attack) {
        if (attack >= 0)
            this.attack = attack;
        else
            this.attack = 0;
    }
    public void incrementAddAttack(int attack){
        setAttack(this.attack + attack);
    }
    public void incrementSubtractAttack(int attack){
        setAttack(this.attack - attack);
    }
    public void incrementMultipleAttack(int attack){
        setAttack((int)(this.attack + attack));
    }

    public int getBallisticSkill() {
        return ballisticSkill;
    }
    public void setBallisticSkill(int ballisticSkill) {
        if (ballisticSkill <= 10 && ballisticSkill >= 0)
            this.ballisticSkill = ballisticSkill;
        else {
            if (ballisticSkill >= 10)
                this.ballisticSkill = 10;
            else
                this.ballisticSkill = 0;
        }
    }
    public void incrementAddBallisticSkill(int ballisticSkill){
        setBallisticSkill(ballisticSkill + this.ballisticSkill);
    }
    public void incrementSubtractBallisticSkill(int ballisticSkill){
        setBallisticSkill(this.ballisticSkill - ballisticSkill);
    }
    public void incrementMultipleBallisticSkill(int ballisticSkill){
        setBallisticSkill((int)(this.ballisticSkill * ballisticSkill));
    }

    public int getInitiative() {
        return initiative;
    }
    public void setInitiative(int initiative) {
        if (initiative <= 10 && initiative >= 1)
            this.initiative = initiative;
        else {
            if (initiative >= 10)
                this.initiative = 10;
            else
                this.initiative = 1;
        }
    }
    public void incrementAddInitiative(int initiative){
        setInitiative(this.initiative + initiative);
    }
    public void incrementSubtractInitiative(int initiative){
        setInitiative(this.initiative - initiative);
    }
    public void incrementMultipleInitiative(int initiative){
        setInitiative((int)(this.initiative * initiative));
    }

    public int getLeadership() {
        return leadership;
    }
    public void setLeadership(int leadership) {
        if (leadership <= 10 && leadership >= 0)
            this.leadership = leadership;
        else {
            if (leadership >= 10)
                this.leadership = 10;
            else
                this.leadership = 0;
        }
    }
    public void incrementAddLeadership(int leadership){
        setLeadership(this.leadership + leadership);
    }
    public void incrementSubtractLeadership(int leadership){
        setLeadership(this.leadership - leadership);
    }
    public void incrementMultipleLeadership(int leadership){
        setLeadership((int)(this.leadership * leadership));
    }

    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        if (strength <= 10 && strength >= 0)
            this.strength = strength;
        else {
            if (strength >= 10)
                this.strength = 10;
            else
                this.strength = 0;
        }
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

    public int getToughness() {
        return toughness;
    }
    public void setToughness(int toughness) {
        if (toughness <= 10 && toughness >= 0)
            this.toughness = toughness;
        else{
            if (toughness >= 10)
                this.toughness = 10;
            else
                this.toughness = 0;
        }
    }
    public void incrementAddToughness(int toughness){
        setToughness(this.toughness + toughness);
    }
    public void incrementSubtractToughness(int toughness){
        setToughness(this.toughness - toughness);
    }
    public void incrementMultipleToughness(int toughness){
        setToughness((int)(this.toughness + toughness));
    }

    public int getWeaponSkill() {
        return weaponSkill;
    }
    public void setWeaponSkill(int weaponSkill) {
        if (weaponSkill <= 10 && weaponSkill >= 0)
            this.weaponSkill = weaponSkill;
        else {
            if (weaponSkill >= 10)
                this.weaponSkill = 10;
            else
                this.weaponSkill = 0;
        }
    }
    public void incrementAddWeaponSkill(int weaponSkill){
        setWeaponSkill(weaponSkill + this.weaponSkill);
    }
    public void incrementSubtractWeaponSkill(int weaponSkill){
        setWeaponSkill(this.weaponSkill - weaponSkill);
    }
    public void incrementMultipleWeaponSkill(int weaponSkill){
        setWeaponSkill((int)(weaponSkill * this.weaponSkill));
    }

    public int getWound() {
        return wound;
    }
    public void setWound(int wound) {
        if (wound >= 0)
            this.wound = wound;
        else
            this.wound = 0;
    }
    public void incrementAddWound(int wound){
        setWound(this.wound + wound);
    }
    public void incrementSubtractWound(int wound){
        setWound(this.wound - wound);
    }
    public void incrementMultipleWound(int wound){
        setWound((int)(this.wound + wound));
    }


    public boolean isIndependentCharacter() {
        return independentCharacter;
    }
    public void setIndependentCharacter(boolean independentCharacter) {
        this.independentCharacter = independentCharacter;
    }

    public boolean isFuriousCharge() {
        return furiousCharge;
    }
    public void setFuriousCharge(boolean furiousCharge) {
        this.furiousCharge = furiousCharge;
    }

    public boolean isFeelNoPain() {
        return feelNoPain;
    }
    public void setFeelNoPain(boolean feelNoPain) {
        this.feelNoPain = feelNoPain;
    }

    public boolean isDodge() {
        return dodge;
    }
    public void setDodge(boolean dodge) {
        this.dodge = dodge;
    }

    public boolean isRampage() {
        return rampage;
    }
    public void setRampage(boolean rampage) {
        this.rampage = rampage;
    }

    public boolean isInfiltrate() {
        return infiltrate;
    }
    public void setInfiltrate(boolean infiltrate) {
        this.infiltrate = infiltrate;
    }

    public boolean isMoveThroughCover() {
        return moveThroughCover;
    }
    public void setMoveThroughCover(boolean moveThroughCover) {
        this.moveThroughCover = moveThroughCover;
    }

    public boolean isShrouded() {
        return shrouded;
    }
    public void setShrouded(boolean shrouded) {
        this.shrouded = shrouded;
    }

    public boolean isStealth() {
        return stealth;
    }
    public void setStealth(boolean stealth) {
        this.stealth = stealth;
    }

    public boolean isBulky() {
        return bulky;
    }
    public void setBulky(boolean bulky) {
        this.bulky = bulky;
    }

    public boolean isDaemon() {
        return daemon;
    }
    public void setDaemon(boolean daemon) {
        this.daemon = daemon;
    }

    public boolean isRending() {
        return rending;
    }
    public void setRending(boolean rending) {
        this.rending = rending;
    }

    public boolean isSwarms() {
        return swarms;
    }
    public void setSwarms(boolean swarms) {
        this.swarms = swarms;
    }

    public boolean isRage() {
        return rage;
    }
    public void setRage(boolean rage) {
        this.rage = rage;
    }

    public boolean isHitAndRun() {
        return hitAndRun;
    }
    public void setHitAndRun(boolean hitAndRun) {
        this.hitAndRun = hitAndRun;
    }

    public boolean isSkilledRider() {
        return skilledRider;
    }
    public void setSkilledRider(boolean skilledRider) {
        this.skilledRider = skilledRider;
    }

    public boolean isFearless() {
        return fearless;
    }
    public void setFearless(boolean fearless) {
        this.fearless = fearless;
    }

    public boolean isCharacters() {
        return characters;
    }
    public void setCharacters(boolean characters) {
        this.characters = characters;
    }

    public boolean isInfantry() {
        return infantry;
    }
    public void setInfantry(boolean infantry) {
        this.infantry = infantry;
    }

    public boolean isBeasts() {
        return beasts;
    }
    public void setBeasts(boolean beasts) {
        this.beasts = beasts;
    }

    public boolean isEldarJetBikes() {
        return eldarJetBikes;
    }
    public void setEldarJetBikes(boolean eldarJetBikes) {
        this.eldarJetBikes = eldarJetBikes;
    }

    public boolean isJumpUnits() {
        return jumpUnits;
    }
    public void setJumpUnits(boolean jumpUnits) {
        this.jumpUnits = jumpUnits;
    }

    public boolean isMonstrousCreatures() {
        return monstrousCreatures;
    }
    public void setMonstrousCreatures(boolean monstrousCreatures) {
        this.monstrousCreatures = monstrousCreatures;
    }

    @Override
    public String toString() {
        return getFaction()+ " "+ getName() + "\nWS  BS  S  T  W  I  A  LD  SV" + "\n" + getWeaponSkill() + "   " +
                getBallisticSkill()+"   " + getStrength() + "  " + getToughness() + "  " + getWound() + "  " +
                getInitiative() + "  " + getAttack() + "   " + getLeadership() + "   " +
                getArmourSave() + "\n" + getDescription();
    }
}
