package designpattern.builder;

public class Student {
    private String name;
    private int rollNumber;
    private String section;
    private String mobileNumber;
    private  String  address;
    private String gender;

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public Student setSection(String section) {
        this.section = section;
        return this;
    }

    public Student setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    public Student setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student setGender(String gender) {
        this.gender = gender;
        return this;
    }
}
