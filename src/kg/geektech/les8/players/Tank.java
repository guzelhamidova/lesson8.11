package kg.geektech.les8.players;

public class Tank extends Hero {
    public Tank(int health, int damage   ) {
        super(health, damage, SuperAbility.TANK);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int num = boss.getDamage()/5;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) {
                heroes[i].setHealth(heroes[i].getHealth() + num);
            }
        }
            this.setHealth(this.getHealth() - num * heroes.length);
        }
}
