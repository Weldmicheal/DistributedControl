import java.util.List;

public class Company {
    private String name;
    private List<Department> departments;

    public Company(String name, List<Department> departments) {
        this.name = name;
        this.departments = departments;
    }

    public double getSalary(){
        double totalCompanySalary = 0;
        for(Department d: departments){
            totalCompanySalary += d.getSalary();
        }
        return  totalCompanySalary;
    }
}
