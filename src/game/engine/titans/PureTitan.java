package game.engine.titans;

public class PureTitan extends Titan{

    @Override
    public void move() {

    }

    @Override
    public void attack() {

    }

    @Override
    public void getAttacked() {

    }

    public PureTitan(int baseHealth, int baseDamage, int heightInMeters, int distanceFromBase,
                     int speed, int resourcesValue, int dangerLevel){
        super(baseHealth, baseDamage, heightInMeters, distanceFromBase, speed, resourcesValue, dangerLevel);
    }


    public static void main(String[] args) {
        System.out.println("Hello, Pure Titan!");
    }

}
