package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class TrickyBastar extends Hero {
    boolean isDead;

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public TrickyBastar(int health, int damage ) {
        super(health, damage, SuperAbility.TRICKY);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        int chance = RPG_Game.random.nextInt(5);
        int num=0;

        if (chance==4){
            num = this.getHealth();
            this.setHealth(0);
            isDead= true;

        }
        else
            this.setHealth(num);
        isDead= false;

    }
}
