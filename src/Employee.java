import java.time.LocalDate;
import java.util.Date;

public class Employee {
    private String Id;
    private LocalDate birthDate;
    private String firstName;
    private String middleInitials;
    private String lastName;
    private String ssn;
    private double salary;

    public Employee(String id, LocalDate birthDate, String firstName, String middleInitials, String lastName, String ssn, double salary) {
        Id = id;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.middleInitials = middleInitials;
        this.lastName = lastName;
        this.ssn = ssn;
        this.salary = salary;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitials() {
        return middleInitials;
    }

    public void setMiddleInitials(String middleInitials) {
        this.middleInitials = middleInitials;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
