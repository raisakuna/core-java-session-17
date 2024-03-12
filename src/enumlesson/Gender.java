package enumlesson;

import java.util.ArrayList;
import java.util.EnumSet;

/** Introduced in Java 5, a special data type acts like a constant
 *  It is used when we  need a fixed set of pre-defined constant values. eg - days of the week, season of the year,
 *  4 suits in a deck of card (club, diamond, heart, spade)
 *  name of the planets, oceans
 *  grouping of constants that behave similarly to objects
 *
 *
 */
public enum Gender {
    MALE ("M"),
    FEMALE("F"),
    OTHER("O");




    Gender(){
        System.out.println("Constructor is called");
    }

    Gender(String abbrv){
        System.out.println("Abbrevation value is " +  abbrv);
    }

    public static void main(String[] args) {
        Gender gender = Gender.MALE;
        System.out.println("Ram is " + gender);

        EnumSet<Gender> genderList =  EnumSet.allOf(Gender.class);
        System.out.println(genderList);

        ArrayList<String>genderList2 = new ArrayList<>();
        genderList2.add(Constants.FEMALE);
        genderList2.add(Constants.MALE);
        genderList2.add(Constants.OTHER);

        System.out.println(genderList2);



    }
}
