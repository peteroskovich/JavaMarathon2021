package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane p = new Airplane("ит", 1999, 10, 100);
        Airplane d = new Airplane("ит", 1999, 160, 100);

        Airplane.compareAirplanes(p, d);

    }
}