package Encapsulation;

public class Class1 {

    //private members
    private String name ;

    //getter method
    public String getName() {
        return name;
    }

    //setter method
    public void setName(String name) {
        this.name = name;
        System.out.println("Updated the name value to " +this.name);
    }

    //getter method for age
    public int getAge() {
        return age;
    }

    //setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    //private member
    private  int age;

}
