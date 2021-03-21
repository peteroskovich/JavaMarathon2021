package day11.task2;

public abstract class Hero implements PhysAttack {
    int health;
    int physAtt;
    int magicAtt;
    double phyDef;
    double magicDef;
    int healing;

    public Hero() {
        health = 100;
    }

    public void physAttack(Hero hero) {
        double attackScore = physAtt *(1-hero.phyDef);
        if (hero.health - attackScore< 0)
            hero.health = 0;
        else {
            hero.health -= attackScore;
        }
    }


}
