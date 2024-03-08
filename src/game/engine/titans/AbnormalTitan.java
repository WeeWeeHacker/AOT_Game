package game.engine.titans;
public class AbnormalTitan extends Titan {

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void getAttacked() {

    }

    public AbnormalTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase,
                         int speed, int resourcesValue, int dangerLevel){
        super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
    }

}
