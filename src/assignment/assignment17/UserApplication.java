package assignment.assignment17;

import assignment.assignment17.User;

import java.util.*;

public class UserApplication {
    public static void main(String[] args) {
        User user1 = new User("ABC", "13", "Male");
        User user2 = new User("XYZ", "23", "Female");
        User user3 = new User("DEF", "20", "Female");

        // ArrayList
        System.out.println(" ==ArrayList  ==");
        ArrayList<User> userArrayList = new ArrayList<>();
        addUsersToList(userArrayList, user1, user2, user3);
        printUsers(userArrayList);

        System.out.println("\n == ArrayList sorted by age ==");
        Collections.sort(userArrayList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });

        printUsers(userArrayList);

        // LinkedList
        System.out.println("\n ==LinkedList ==");
        LinkedList<User> userLinkedList = new LinkedList<>();
        addUsersToList(userLinkedList, user1, user2, user3);
        printUsers(userLinkedList);

        // Sort ArrayList in descending order by name using Comparator
        System.out.println("\n == LinkedList sorted by name ==");
        Collections.sort(userLinkedList, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return -o1.getName().compareTo(o2.getName());
            }
        });

        printUsers(userLinkedList);


    }

    // Method to add users to a list
    public static void addUsersToList(List<User> userList, User... users) {
        for (User user : users) {
            userList.add(user);
        }
    }

    // Method to print users from a list
    public static void printUsers(List<User> userList) {
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
