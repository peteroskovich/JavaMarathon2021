package day6;

class Car {
    void info() {
        System.out.println("Это автомобиль");
    }

    int yearDifference(int inputYear) {
        int dif = Math.abs(inputYear - Age);
        System.out.println(dif);
        return dif;
    }

    private int Age;
    private String color;
    private String model;

    public void setColor(String colorName) {
        color = colorName;
    }

    public void setModel(String modelName) {
        model = modelName;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setAge(int userAge) {
        Age = userAge;
    }

    public int getAge() {
        return Age;
    }
}

