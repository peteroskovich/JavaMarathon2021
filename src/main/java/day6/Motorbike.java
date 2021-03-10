package day6;

class Motorbike {
    void info() {
        System.out.println("Это мотоцикл");
    }

    int yearDifference(int inputYear) {
        int dif = Math.abs(inputYear - age);
        System.out.println(dif);
        return dif;
    }

    private int age;
    private String color;
    private String model;

    public Motorbike(String color, String model, int age) {
        this.color = color;

        this.model = model;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getAge() {
        return age;
    }

}

