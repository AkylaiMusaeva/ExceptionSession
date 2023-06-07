package Sphere;

public class Sphere {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    public double getArea(){
       return 4*Math.PI*Math.pow(r,2);

    }
    public double getVolume(){
        return 4/3*Math.PI*Math.pow(r,3);
    }
}
