package game.engine.titans;
import java.lang.*;
import java.util.*;

public abstract class Titan implements Comparable <Titan> {

    public void setDistanceFromBase(int distanceFromBase) {
        this.distanceFromBase = distanceFromBase;
    }

    protected int distanceFromBase;

    public Titan(int distanceFromBase, int baseHealth, int baseDamage, int heightInMeters, int resourcesValue, int dangerLevel) {
        this.distanceFromBase = distanceFromBase;
        this.baseHealth = baseHealth;
        this.baseDamage = baseDamage;
        this.heightInMeters = heightInMeters;
        this.resourcesValue = resourcesValue;
        this.dangerLevel = dangerLevel;
    }

    public abstract void move();

    public abstract void attack();

    public abstract void getAttacked();

    public int getDistanceFromBase() {
        return distanceFromBase;
    }


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
          int distanceFromBase, int speed, int resourcesValue, int dangerLevel, int baseHealth1, int baseDamage1, int heightInMeters1, int resourcesValue1, int dangerLevel1){
        currentHealth = baseHealth;
        this.baseHealth = baseHealth1;
        this.baseDamage = baseDamage1;
        this.heightInMeters = heightInMeters1;
        this.resourcesValue = resourcesValue1;
        this.dangerLevel = dangerLevel1;
    }

    @Override
    public int compareTo(Titan o){
        return o.distanceFromBase;
    }

}
