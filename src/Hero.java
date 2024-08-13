public class Hero {
    private String name;
    private int minDamage;
    private int maxDamage;
    private int maxHealthPoints;
    private int actualHealthPoints;
    private int dodgeRating;
    private int criticalRate;
    private boolean isAlive;
    private boolean hasDodged;
    private boolean hasDeliveredCritical;
    private boolean isStunned;

    public Hero(String name, int maxDamage, int maxHealthPoints, int dodgeRating, int criticalRate) {
        this.name = name;
        this.minDamage = 1;
        this.maxDamage = maxDamage;
        this.maxHealthPoints = maxHealthPoints;
        this.actualHealthPoints = maxHealthPoints;
        this.dodgeRating = dodgeRating;
        this.criticalRate = criticalRate;
        this.isAlive = true;
        this.hasDodged = false;
        this.hasDeliveredCritical = false;
        this.isStunned = false;
    }

    public String getName() {
        return name;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getActualHealthPoints() {
        return actualHealthPoints;
    }

    public void setActualHealthPoints(int actualHealthPoints) {
        this.actualHealthPoints = actualHealthPoints;
    }

    public int getDodgeRating() {
        return dodgeRating;
    }

    public void setDodgeRating(int dodgeRating) {
        this.dodgeRating = dodgeRating;
    }

    public int getCriticalRate() {
        return criticalRate;
    }

    public void setCriticalRate(int criticalRate) {
        this.criticalRate = criticalRate;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void kill() {
        this.isAlive = false;
    }

    public boolean isHasDodged() {
        return hasDodged;
    }

    public void setHasDodged(boolean hasDodged) {
        this.hasDodged = hasDodged;
    }

    public boolean isHasDeliveredCritical() {
        return hasDeliveredCritical;
    }

    public void setHasDeliveredCritical(boolean hasDeliveredCritical) {
        this.hasDeliveredCritical = hasDeliveredCritical;
    }

    public boolean isStunned() {
        return isStunned;
    }

    public void setStunned(boolean stunned) {
        isStunned = stunned;
    }

    @Override
    public String toString(){
        String message = "Nombre: "+name+"\nSalud: "+actualHealthPoints+"/"+maxHealthPoints;
        if (!isAlive || isStunned) {
            message += "\nEstado: ";
            if (!isAlive) {
                message +="Muerto";
            } else {
                message += "Aturdido";
            }
        }
        return message;
    }
}
