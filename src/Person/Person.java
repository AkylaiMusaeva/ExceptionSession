package Person;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;
    private int startWorkingYear;
public Person(){

}
    public Person(String firstName, String lastName, int birthYear, int startWorkingYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.startWorkingYear = startWorkingYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getStartWorkingYear() {
        return startWorkingYear;
    }

    public void setStartWorkingYear(int startWorkingYear) {
        this.startWorkingYear = startWorkingYear;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~Person.Person info~~~~~~~~~~~\n" +
                "\nfirstName: " + firstName + '\'' +
                "\nlastName: " + lastName + '\'' +
                "\nbirthYea: " + birthYear +
                "\nstartWorkingYear: " + startWorkingYear;
    }
}
