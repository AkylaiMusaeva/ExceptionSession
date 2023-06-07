package Random;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception{

        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("input an email");
            String email=scanner.nextLine();
            if(!email.matches("[a-zA-Zа-яА-Я-@. ]*")){
                throw new MyException("Numbers are not allowed in email");
            }
            if(!email.startsWith("@") && (!email.endsWith("@"))){
                throw new MyException("Email should start and end with -@-");
            }
            if(!email.contains(".com")){
               throw new MyException("Email should end with '.com'");
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }















//        try(FileWriter fileWriter=new FileWriter("testJava10.txt");
//            FileReader fileReader=new FileReader("testJava10.txt"))
//        {
//
//        fileWriter.close();
//    }catch(IOException i){
//            System.out.println(i.getMessage());
//        }
//

//        Car car=new Car();
//        try {
//            System.out.println(car.method());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
