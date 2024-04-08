package assignment.assignment17;

import java.util.*;

public class SetApplication {

    public static void main(String[] args) {
        User user0 = new User("ABC", "83", "Male");
        User user1 = new User("NAC", "43", "Female");
        User user2 = new User("XYZ", "13", "Female");
        User user3 = new User("DEF", "20", "Female");

        // Set
        System.out.println("\n ==HashSet==");
        Set<User> userHashSet = new HashSet<>();
        addUserToHashSet(userHashSet, user0, user1, user2, user3);
        printUsers(userHashSet);

        // Sort HashSet by name
        System.out.println("\n ==HashSet sorted by name==");
        Set<User> sortedByName = new TreeSet<>(UserComparators.byName());
        sortedByName.addAll(userHashSet);
        printUsers(sortedByName);

        // Sort HashSet by age
        System.out.println("\n ==HashSet sorted by age==");
        Set<User> sortedByAge = new TreeSet<>(UserComparators.byAge());
        sortedByAge.addAll(userHashSet);
        printUsers(sortedByAge);
    }

    // Method to add users to a HashSet
    public static void addUserToHashSet(Set<User> userHashSet, User... users) {
        Collections.addAll(userHashSet, users);
    }

    // Method to print users from a collection
    public static void printUsers(Collection<User> userList) {
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
