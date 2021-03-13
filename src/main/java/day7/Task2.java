package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int r = random.nextInt(100 - 90) + 90;
        Player p1 = new Player(r);
        Player p2 = new Player(r);
        Player p3 = new Player(r);
        Player p4 = new Player(r);
        Player p5 = new Player(r);
        Player p6 = new Player(r);
        p6.info();
        Player p7 = new Player(r);
        p7.info();
        p7.getPlayers();
        for(int i=0; i<r; i++)
            p2.run();

p6.info();
    }
}
