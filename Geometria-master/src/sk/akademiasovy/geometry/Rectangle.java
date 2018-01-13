package sk.akademiasovy.geometry;

public class Rectangle {
    private double a;
    private double b;



    public Rectangle (double value){
        a=value;
        b=value;
    }

    public Rectangle(){
        a=b=0;
    }

    public Rectangle (double value, double value1 ){
        a=value;
        b=value1;
    }

    public double getArea(){
        return a*b;
    }
    public double getPerimeter(){
        return 2*a+2*b;
    }

    public double getDiagonal(){
        return Math.sqrt(a*a+b*b);
    }

    public void transpose(){
        int temp;
        temp = a ;
        a = b;
        b = temp;
    }
}


