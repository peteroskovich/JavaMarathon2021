package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;

        int fuel = 0;
        this.fuel = fuel;
    }

    void fillUp(int n) {
        fuel = fuel + n;
        this.fuel = fuel;
    }

    void info() {
        System.out.println("Изготовитель " + producer + " год выпуска " + year + " длина " + length + " вес " + weight + " количество топлива в баке " + fuel);

    }

    public void setProducer(String producer) {
        this.producer = producer;
    }


    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public static void compareAirplanes(Airplane p, Airplane d) {
        if (d.length > p.length) {
            System.out.println("Самолет d длиннее p");
        } else {
            System.out.println("Самолет p длиннее d");
        }

    }

}

