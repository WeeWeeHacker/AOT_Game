package game.engine.weapons;

public abstract class Weapon {

    public int getBaseDamage() {
        return baseDamage;
    }

    final int baseDamage;

    public Weapon(int baseDamage) {
        this.baseDamage = baseDamage;
    }

    final int PiercingCannon = 1;
    final int SniperCannon = 2;
    final int VolleySpreadCannon = 3;
    final int WallTrap = 4;
}
