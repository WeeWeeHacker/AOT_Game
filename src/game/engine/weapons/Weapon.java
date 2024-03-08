package game.engine.weapons;

public abstract class Weapon {

    public int getBaseDamage() {
        return baseDamage;
    }

    final int baseDamage;

    public Weapon(int baseDamage) {
        this.baseDamage = baseDamage;
    }


}
