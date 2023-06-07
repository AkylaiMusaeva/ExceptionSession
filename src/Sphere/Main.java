package Sphere;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.println("Input radius ");
            double r = scanner.nextDouble();
            if(r<=0){
                throw new MyException("negative number is not allowed ");
            }
            if(r>=20){
                throw new MyException("number is above 20");
            }
            Sphere sphere=new Sphere(r);
            System.out.println("Площадь сферы равна "+sphere.getArea());
            System.out.println("Объем сферы равен "+sphere.getVolume());
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Letters are not allowed");
        }
    }
}
