package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Haker extends Hero {
    public Haker(int health, int damage) {
        super(health, damage, SuperAbility.HAKER);
    }


    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int num = RPG_Game.random.nextInt(heroes.length);
        int k = RPG_Game.random.nextInt(100) + 20;
        if (RPG_Game.getRoundNumber() % 2 == 0) {
            if (heroes[num].getHealth() > 0) {
                boss.setHealth(boss.getHealth() - k);
                heroes[num].setHealth(heroes[num].getHealth() + k);
                System.out.println("Hacker heal hero " + heroes[num].getSuperAbility() + " for " + k);

            } else if (heroes[num].getHealth() == 0) {
                boss.setHealth(boss.getHealth() - k);
                heroes[num++].setHealth(heroes[num++].getHealth() + k);
                System.out.println("Hacker heal hero " + heroes[num++].getSuperAbility() + " for " + k);
            }
        }
    }
}
