package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    static int countPlayer = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayer < 6)
            countPlayer++;

    }

    public int getStamina() {
        return stamina;
    }


    public int getPlayers() {
        System.out.println(countPlayer);
        return countPlayer;
    }

    void run() {
        if (stamina==0)
            return;
        stamina--;
        if (stamina == 0) {
            System.out.println("Игроку нужен отдых");
            countPlayer--;
        }
    }

    void info() {
        if (countPlayer < 6) {
            System.out.println("Команды не полные. На поле еще есть " + (6 - countPlayer) + " свободных мест ");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}


