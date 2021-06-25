import java.util.List;

public class Department {
    private String name;
    private String location;
    private List<Position> positions;

    public Department(String name, String location, List<Position> positions) {
        this.name = name;
        this.location = location;
        this.positions = positions;
    }

    public double getSalary(){
        double totalDepSalary = 0;
        for(Position p: positions){
            totalDepSalary += p.getSalary();
        }
        return totalDepSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
