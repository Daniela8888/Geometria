package sk.akademiasovy.geometry;

public class Rectangle {
    private double a;
    private double b;



    public Rectangle (double a,double b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(){
        a=b=0;
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


