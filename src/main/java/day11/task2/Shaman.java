package day11.task2;

public class Shaman extends Hero implements MagicAttack, PhysAttack, Healer{
    public Shaman() {
        health=100;
        phyDef = 0.2;
        magicDef = 0.2;
        physAtt = 10;
        magicAtt = 15;
    }
    public void healHimself() {

        if (health +50 > 100)
            health = 100;
        else {
            health += 50;
        }
    }
    public void healTeammate(Hero hero){
        if (hero.health+30>100) {
            hero.health =100;
        }
        else{
            hero.health+=30;
        };
    }
    public void magicAttack(Hero hero) {
        double attackScore = magicAtt  * (1- hero.magicDef);
        if (hero.health - attackScore < 0)
            hero.health = 0;
        else {
            hero.health -= attackScore;
        }
    }


    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
