package day5;
class Motorbike{
    private int age;
    private String color;
    private String model;

    public Motorbike(String color, String model, int age){
        this.color=color;

        this.model=model;
        this.age=age;
            }
public String getColor(){
        return color;
    }
    public String getModel(){
        return model;
    }
    public int getAge(){
        return age;
    }

}

public class Task2 {
    public static void main(String[] args) {
        Motorbike mot= new Motorbike(" Черный " , " Ауди " ,10);
        System.out.println(mot.getAge() + mot.getColor() + mot.getModel());



    }
}
