package day9.Task2;

public class Rectangle extends Figure {
    private int high;
    private int width;
    public Rectangle(int high, int width,String color){
        super(color);
        this.high=high;
        this.width=width;
    }
    public double area(){
        return high*width;
    }
    public double perimeter(){
        return high+width;
    }
}
