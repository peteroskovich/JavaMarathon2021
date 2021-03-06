package day5;

class Car {
     private int Age;
    private String color;
    private String model;

    public void setColor(String colorName) {
        color = colorName;
             }
    public void setModel (String modelName ) {
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

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setAge(1997);
        car1.setColor("Белый");
        car1.setModel("БМВ");
        System.out.println("Год выпуска " + car1.getAge());
        System.out.println("Цвет модели " + car1.getColor());
        System.out.println("Модель машины " + car1.getModel());

    }
}