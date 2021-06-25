import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void main(String [] args){

        Employee e1 = new Employee("1", LocalDate.of(1989, 06,12),
                "Weldmicheal", "B", "Hailu", "12334", 120000);
        Employee e2 = new Employee("2", LocalDate.of(1991, 06,12),
                "Hagos", "B", "Hailu", "12334", 160000);
        Employee e3 = new Employee("3", LocalDate.of(1993, 06,12),
                "Fisseha", "B", "Hailu", "12334", 180000);
        Employee e4 = new Employee("1", LocalDate.of(1995, 06,12),
                "Delay", "B", "Hailu", "12334", 190000);
        Employee e5 = new Employee("1", LocalDate.of(1997, 06,12),
                "Tekle", "B", "Hailu", "12334", 200000);
        Employee e6 = new Employee("1", LocalDate.of(2000, 06,12),
                "Abrhet", "B", "Hailu", "12334", 250000);
        Employee e7 = new Employee("1", LocalDate.of(2003, 06,12),
                "Muez", "B", "Hailu", "12334", 300000);

        Position p1 = new Position("Engineer", "It engineer", e1);
        Position p2 = new Position("Technician", "Mobile engineer", e2);
        Position p3 = new Position("Designer", "Fashion Designer", e3);
        Position p4 = new Position("Investor", "General Investor", e4);
        Position p5 = new Position("Admin", "System Admin", e5);
        Position p6 = new Position("Apparent", "Field Engineer", e6);
        Position p7 = new Position("Student", "HighSchool", e7);

        Department d1 = new Department("Is", "Iowa", Arrays.asList(p1, p5));
        Department d2 = new Department("RandD", "Dengolat", Arrays.asList(p2, p3, p4));
        Department d3 = new Department("Study", "Mekelle", Arrays.asList(p6, p7));

        Company c = new Company("WandBros", Arrays.asList(d1, d2, d3));

        double totalCompanySalary = c.getSalary();

        System.out.println("Total Company Salary is: " + totalCompanySalary);




    }
}
