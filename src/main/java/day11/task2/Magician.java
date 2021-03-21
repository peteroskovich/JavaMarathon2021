package day11.task2;

import javafx.scene.CacheHint;

public class Magician extends Hero implements MagicAttack, PhysAttack {
    public Magician() {
        health=100;
        phyDef = 0;
        magicDef = 0.8;
        physAtt = 5;
        magicAtt = 20;
    }

    public void magicAttack(Hero hero) {
        double attackScore = magicAtt  * (1- hero.magicDef);
        if (hero.health - attackScore< 0)
            hero.health = 0;
        else {
            hero.health -= attackScore;
        }
    }



    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }
}




