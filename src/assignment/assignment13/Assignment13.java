package assignment.assignment13;

import java.util.ArrayList;

public class Assignment13 {
    private int rollNumber;
    private String name;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Assignment13(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Assignment13{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Assignment13 that = (Assignment13) o;

        if (rollNumber != that.rollNumber) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = rollNumber;
        result = 31 * result + name.hashCode();
        return result;
    }

    public static void main(String[] args) {
        // ArrayList with built-in-class
        ArrayList<String> builtInList = new ArrayList<>();
        ArrayList<String> anotherBuiltInList= new ArrayList<>();

        // adding data
        builtInList.add("ram");
        builtInList.add("hari");
        builtInList.add("shyam");

        anotherBuiltInList.add("Simran");
        anotherBuiltInList.add("Payal");

        System.out.println(builtInList);
        // adding data to specific index
        builtInList.add(1, "John");
        System.out.println(builtInList);

        // adding list to list
        builtInList.addAll(anotherBuiltInList);
        System.out.println(builtInList);

        // remove data by index
        builtInList.remove(1);
        System.out.println(builtInList);

        // remove data by object
        builtInList.remove("shyam");
        System.out.println(builtInList);

        // update data by index
        builtInList.set(0, "Rahde");

        System.out.println(builtInList);

        // checking the size
        System.out.println("Size of the builtInList: " + builtInList.size());

        // clear all the list
        builtInList.clear();
        System.out.println(builtInList);

        System.out.println("====== Custom class ========");
        ArrayList<Assignment13> customList = new ArrayList<>();
        ArrayList<Assignment13> customList1 = new ArrayList<>();

        // Adding data
        System.out.println("a. Adding data");

        customList.add(new Assignment13(1, "Alan"));
        customList.add(new Assignment13(2, "Jack"));
        customList.add(new Assignment13(3, "Harris"));

        customList1.add(new Assignment13(6, "Alicia"));
        customList1.add(new Assignment13(7, "Martin"));

        // Print custom list
        printCustomList(customList);

        // Adding data to specific index
        System.out.println("b. Adding data to specific index");
        customList.add(2, new Assignment13(4, "Rose"));

        // Print custom list after adding data to specific index
        printCustomList(customList);

        // Adding customList1 to customList
        customList.addAll(customList1);
        printCustomList(customList);


        // remove data by index
        System.out.println("d. Removing data by index");
        customList.remove(2);
        printCustomList(customList);

        // remove data by object
        /**
         * We have to override equals method for comparison checking, then run removeIf()
         */
        System.out.println("e. Removing data by object");
        customList.removeIf(obj -> obj.getName().equals("Alan"));
        printCustomList(customList);

        // updating data by index
        System.out.println("f. Updating data by object");
        customList.set(0, new Assignment13(10,"NewData"));
        printCustomList(customList);

        // check the size
        System.out.println("Size of custom list: " + customList.size());

        // clear all
        customList.clear();
        System.out.println(customList);
    }

    // Method to print custom list
    public static void printCustomList(ArrayList<Assignment13> list) {
        System.out.println("RollNumber Name");
        for (Assignment13 obj : list) {
            System.out.println(obj.getRollNumber() + "\t\t\t" + obj.getName());
        }
    }
}






