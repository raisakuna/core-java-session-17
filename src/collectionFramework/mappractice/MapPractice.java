package collectionFramework.mappractice;

import java.util.ArrayList;
import java.util.HashMap;

public class MapPractice {

    /*
     [
      {
          "name":"ABC",
          "age":"10",
          "gender":"Male"
      },
      {
      "name":"DEF",
      "age":"15",
       "gender":"Female"
     }
     ]
     */

    public static void main(String[] args) {
        ArrayList<String> userDetail  = new ArrayList<>();
        userDetail.add("ABC");
        userDetail.add("10");
        userDetail.add("Male");

        String age = userDetail.get(1);

        HashMap<String, String> userDetailMap1 = new HashMap<>();
        userDetailMap1.put("name","ABC");
        userDetailMap1.put("age","10");
        userDetailMap1.put("gender","Male");

        HashMap<String, String> userDetailMap2 = new HashMap<>();
        userDetailMap1.put("name","DEF");
        userDetailMap1.put("age","11");
        userDetailMap1.put("gender","Female");

        age = userDetailMap1.get("age");
        System.out.println(age);
        String age1=  userDetailMap2.get("age");
        System.out.println(age1);

        System.out.println(userDetailMap1);
        System.out.println();

        // Another approach of storing value for treemap
        User user1 = new User("ABC", "13","Male");
        User user2 = new User("XYZ", "23","Female");

        ArrayList<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);

for(User printUser : userList){
    System.out.println(printUser);
}

    }

}
