// package Encapsulation;

public class Student {
    private String name;
    private int age;
    private String address;

    public Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name) {
        // this is setter
        this.name = name;
    }

    public void setAge(int age) {
        // this is setter
        this.age = age;
    }

    public void setAddress(String address) {
        // this is setter
        this.address = address;
    }

    public String getName() {
        // this is getter
        return name;
    }

    public int getAge() {
        // this is getter
        return age;
    }

    public String getAddress() {
        // this is getter
        return address;
    }

    @Override
    public String toString() {
        return ("Student Name is " + this.getName() + ", Age is : " + this.getAge() + "and Address is : "
                + this.getAddress());
    }

    public static void main(String args[]) {
        Student john = new Student("John", 33, "23 East California");
        System.out.println(john.getName());
        System.out.println(john.getAge());
        System.out.println(john.getAddress());
    }

}
