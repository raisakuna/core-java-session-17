package inheritance;

import java.time.LocalDate;
import java.util.List;

public class Manager extends Person{

    private String department;

    private double bonus;
    private List<Employee> tree;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public List<Employee> getTree() {
        return tree;
    }

    public void setTree(List<Employee> tree) {
        this.tree = tree;
    }


}
