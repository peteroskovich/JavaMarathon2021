package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air1= new Airplane("ABC", 1999, 180, 100);
air1.setYear(2011);
        air1.setFuel(20);
        air1.fillUp(100);
        air1.info();

    }
}
