package Person;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("~~~~`Welcome~~~~");
            System.out.println("Write your name: ");
            try {
                String name = scanner.nextLine();
                if (!name.matches("[a-zA-Zа-яА-Я-]*")) {
                    throw new MyException("Name can not be written by numbers ");
                }
                System.out.println("Write your last name");
                String lastName=scanner.nextLine();
                if(!lastName.matches("[a-zA-Zа-яА-Я- ]*")){
                    throw new MyException("Last name can not be written by numbers ");
                }
                System.out.println("Write your year of birth");
                int birthYear= scanner.nextInt();
                if(LocalDate.now().getYear()<birthYear){
                    throw new MyException("Future is yet to come,do not write future years ");
                }
                System.out.println("Write year of start working");
                int startWorkingYear= scanner.nextInt();
                if(LocalDate.now().getYear()<startWorkingYear){
                    throw new MyException("Date of start can not be in future");
                }
                if((startWorkingYear-birthYear)<18){
                    throw new MyException("You are not adult yet");
                }
                Person person=new Person(name,lastName,birthYear,startWorkingYear);
                System.out.println(person);
            }catch (MyException e) {
                System.out.println(e.getMessage());
            }catch (InputMismatchException e){
                System.out.println("Birth year can not be written with letters");
            }
        }
    }
}
