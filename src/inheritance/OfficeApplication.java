package inheritance;

import java.time.LocalDate;

public class OfficeApplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Taman");
        employee.setAddress("Kathmandu, Nepal");
        employee.setDepartment("Database");
        employee.setSalary(6000.00);
        employee.setJoiningDate(LocalDate.now());
        employee.setGender("Male");
        System.out.println("\n\n********** Employee Details ********");
        System.out.println(String.format(
                        "\tName: %14s" +
                        "\n\tAddress: %14s" +
                        "\n\tDepartment: %9s" +
                        "\n\tSalary: %13.2f" +
                        "\n\tJoining Date: %2s" +
                        "\n\tGender: %10s",
                employee.getName(),
                employee.getAddress(),
                employee.getDepartment(),
                employee.getSalary(),
                employee.getJoiningDate(),
                employee.getGender()
        ));

        Manager manager =  new Manager();
        manager.setName("ABC");
        manager.setAddress("New York");
        manager.setDepartment("Database");
        manager.setGender("Male");
        manager.setBonus(1000);
        manager.setSalary(8000);
        manager.setJoiningDate(LocalDate.now());

        System.out.println("\n====**** Manager Details: *****====== " +
                "\n\tName: "+manager.getName() +
                "\n\tAddress: "+manager.getAddress() +
                "\n\tDepartment: "+manager.getDepartment() +
                "\n\tSalary: "+manager.getSalary() +
                "\n\tBonus: "+manager.getBonus() +
                "\n\tJoining Date: "+manager.getJoiningDate() +
                "\n\tGender: "+manager.getGender()
        );


        Director director = new Director();
        director.setBonus(700);
        director.setSharePercentage(5);
        director.setName("John Doe");
        director.setAddress("California");
        director.setGender("F");
        director.setSalary(9000);
        System.out.println("\n****== Director's Details ===*******");
        System.out.println(
                "\tName: "+director.getName() +
                "\n\tAddress: "+director.getAddress() +
                "\n\tDepartment: "+director.getSharePercentage() +
                "\n\tSalary: "+director.getSalary() +
                "\n\tBonus: "+director.getBonus() +
                "\n\tJoining Date: "+director.getJoiningDate() +
                "\n\tGender: "+director.getGender()
        );
    }
}
