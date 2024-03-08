package game.engine.titans;
import java.lang.*;
import java.util.*;

public abstract class Titan implements Comparable <Titan> {

    public void setDistanceFromBase(int distanceFromBase) {
        this.distanceFromBase = distanceFromBase;
    }

    protected int distanceFromBase;

    public Titan(int distanceFromBase) {
        this.distanceFromBase = distanceFromBase;
    }

    public abstract void move();

    public abstract void attack();

    public abstract void getAttacked();

    public int getDistanceFromBase() {
        return distanceFromBase;
    }

    @Override
    public int compareTo(Titan titan) {
        return Integer.compare(this.distanceFromBase, titan.distanceFromBase);
    }

    public int getBaseHealth() {
        return baseHealth;
    }

    final int baseHealth;

    public int getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(int currentHealth) {
        this.currentHealth = currentHealth;
    }

    int currentHealth;

    public int getBaseDamage() {
        return baseDamage;
    }

    final int baseDamage;

    public int getHeightInMeters() {
        return heightInMeters;
    }

    final int heightInMeters;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    int speed;

    public int getResourcesValue() {
        return resourcesValue;
    }

    final int resourcesValue;

    public int getDangerLevel() {
        return dangerLevel;
    }

    final int dangerLevel;

    Titan(int baseHealth, int baseDamage, int heightInMeters,
          int distanceFromBase, int speed, int resourcesValue, int dangerLevel){
        currentHealth = baseHealth;
    }

    @Override
    public int compareTo(Titan o){
        return o.distanceFromBase;
    }

}
