package BaseArea;

/**
 * Created by jnebl on 4/9/2017.
 */
public class AllModels extends SpecialRule {
    private int points;
    private boolean deepStrike = false,fear = false,fleet = false,nightVision = false;
    private boolean hq = false,troops = false,elites = false,fastAttack = false,heavySupport = false;
    public AllModels(String name,String description,int points){
        super(name,description);
        setPoints(points);
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

    public boolean isDeepStrike() {
        return deepStrike;
    }
    public void setDeepStrike(boolean deepStrike) {
        this.deepStrike = deepStrike;
    }

    public boolean isHq() {
        return hq;
    }
    public void setHq(boolean hq) {
        this.hq = hq;
    }

    public boolean isElites() {
        return elites;
    }
    public void setElites(boolean elites) {
        this.elites = elites;
    }

    public boolean isTroops() {
        return troops;
    }
    public void setTroops(boolean troops) {
        this.troops = troops;
    }

    public boolean isFastAttack() {
        return fastAttack;
    }
    public void setFastAttack(boolean fastAttack) {
        this.fastAttack = fastAttack;
    }

    public boolean isHeavySupport() {
        return heavySupport;
    }
    public void setHeavySupport(boolean heavySupport) {
        this.heavySupport = heavySupport;
    }
}
