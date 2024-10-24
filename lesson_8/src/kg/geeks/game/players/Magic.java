package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Magic extends Hero {
    int boost;

    public void setBoost(Hero[] heroes, int boost) {
        this.boost = boost;
    }

    public Magic(String name, int health, int damage, int boost) {
        super(name, health, damage, SuperAbility.BOOST);
        this.boost = boost;
    }

    public void setBoost(int boost) {
        this.boost = boost;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.getRoundNumber() <= 4 ){
        System.out.println("Potter boosting the attack of all heroes" );
            for (Hero hero : heroes){
                boost = hero.getDamage() * 2;
                hero.setDamage(boost);
                boss.setHealth(boss.getHealth() - this.getDamage());
            }
        }else {
            System.out.println("does not boosting after the 4 round");

        }
    }
}

