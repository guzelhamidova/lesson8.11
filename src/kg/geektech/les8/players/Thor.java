package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Thor extends Hero {

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.THOR);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int chance = RPG_Game.random.nextInt(3);
        if (chance==2){
            boss.setDamage(0);
            System.out.println("Boss stan");

        }
        else boss.setDamage(100);

    }
}
