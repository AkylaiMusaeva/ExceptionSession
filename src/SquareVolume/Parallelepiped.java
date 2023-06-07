package SquareVolume;

public class Parallelepiped {
    private double height;
    private double length;
    private double width;
    public Parallelepiped(){

    }
    public Parallelepiped(double height,double length,double width){
        this.height=height;
        this.length=length;
        this.width=width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea(){
        return 2*((height * length) + (length * width) + (height * width));
    }
    public double getVolume(){
        return  (length*width*height);
    }
}
