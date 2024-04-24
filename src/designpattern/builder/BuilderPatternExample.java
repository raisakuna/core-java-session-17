package designpattern.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Student student1= new Student()
                .setName("JohnDoe")
                .setGender("Male");

        Student student2 = new Student()
                .setName("JohnDoe")
                .setRollNumber(12);

        Student student3 = new Student()
                .setName("JohnDoe")
                .setMobileNumber("1231212212");
    }
}
