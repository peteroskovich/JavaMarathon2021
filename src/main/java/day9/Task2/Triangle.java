package day9.Task2;

public class Triangle extends Figure{
    private int side1;
    private int side2;
    private int side3;

    public Triangle( int side1, int side2, int side3,String color){
        super(color);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double perimeter() {
       double p = (side1 + side2 + side3) / 2;

        return p;
    }
    public double area(){
         double a=Math.sqrt(perimeter()*(perimeter()-side1)*(perimeter()-side2)*(perimeter()-side3));

         return a;

    }

    }


