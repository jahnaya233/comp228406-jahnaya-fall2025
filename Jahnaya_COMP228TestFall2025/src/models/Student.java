package models;

public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String province;
    private String postalCode;

    public Student(String studentId, String firstName, String lastName, String address, String city, String province, String postalCode) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;

    }

    public String getStudentId() {
        return studentId;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity(){
        return city;

    }

    public String getProvince(){
        return province;
    }

    public String getPostalCode(){
        return postalCode;
    }
}
