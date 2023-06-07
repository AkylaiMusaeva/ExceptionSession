package SquareVolume;

import Sphere.MyException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        while (true) {  System.out.println("""
                    Выберите операцию
                    1-Площадь параллепиппеда 
                    2-Объем параллепипеда
                    3-Площадь цилиндра
                    4-Объем цилиндра """);
            num= scanner.nextInt();
            switch (num) {
                case 1:
                    while(true) {
                        try {
                            System.out.println("Найдем площадь параллелепипеда");
                            System.out.println("Введите высоту: ");
                            double h = scanner.nextDouble();
                            if (h <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            System.out.println("Введите длину: ");
                            double l = scanner.nextDouble();
                            if (l <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            System.out.println("Введите ширину ");
                            double w = scanner.nextDouble();
                            if (w <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            Parallelepiped parallelepiped = new Parallelepiped(h, l, w);
                            System.out.println("Площадь параллепипеда равна -> " + parallelepiped.getArea());
                            break;

                        } catch (MyException1 e) {
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Нельзя вводить буквы!");
                            break;
                        }
                    }break;
                case 2:
                    while(true) {
                        try {
                            System.out.println("Найдем объем параллепипеда");
                            System.out.println("Введите высоту ");
                            double h = scanner.nextDouble();
                            if (h <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            System.out.println("Введите длину ");
                            double l = scanner.nextDouble();
                            if (l <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            System.out.println("Введите ширину ");
                            double w = scanner.nextDouble();
                            if (w <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            Parallelepiped parallelepiped = new Parallelepiped(h, l, w);
                            System.out.println("Объем параллепипеда равен -> " + parallelepiped.getVolume());
                            break;

                        } catch (MyException1 e) {
                            System.out.println(e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Нельзя вводить буквы!");
                        }
                    }break;
                case 3:
                    while(true){
                        try{
                            System.out.println("Найдем площадь цилиндра");
                            System.out.println("Введите высоту");
                            double h=scanner.nextDouble();
                            if(h<=0){
                                throw new MyException1("Введите только положительные числа");
                            }
                            System.out.println("Введите радиус");
                            double r=scanner.nextDouble();
                            if(r<=0){
                                throw new MyException1("Введите только положительные числа");
                            }
                            Cylinder cylinder=new Cylinder(r,h);
                            System.out.println("Площадь цилиндра равна "+cylinder.getArea());
                            break;
                        }catch(MyException1 e){
                            System.out.println(e.getMessage());
                        }
                        catch (InputMismatchException e){
                            System.out.println("Нельзя вводить буквы!");
                        }
                    }break;
                case 4:
                    while(true) {
                        try {
                            System.out.println("Найдем объем цилиндра");
                            System.out.println("Введите высоту");
                            double h = scanner.nextDouble();
                            if (h <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            System.out.println("Введите радиус");
                            double r = scanner.nextDouble();
                            if (r <= 0) {
                                throw new MyException1("Введите только положительные числа");
                            }
                            Cylinder cylinder=new Cylinder();
                            System.out.println("Объем цилиндра равен "+cylinder.getVolume());
                            break;
                        }catch (MyException1 e){
                            System.out.println(e.getMessage());
                        }
                        catch(InputMismatchException e){
                            System.out.println("Нельзя вводить буквы!");
                        }
                    }
                    break;
                default:
                    System.out.println("Введите числа только от 1 до 4");
                    }

            }
    }
}
