package SquareVolume;

public class Cylinder {
    private double radius;
    private double height;
    public static final double PI=3.14;
    public Cylinder(){

    }
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public double getArea(){
        return 2*PI * radius*( height + radius);
    }
    public double getVolume(){
        return  (PI*radius*radius*height);
    }
}
