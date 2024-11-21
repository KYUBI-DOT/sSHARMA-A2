//Abstract class
public abstract class Person {
    private String name;
    private int age;
    private String ContactNumber;


 // Default constructor which performs nothing
 public Person(){
    
    
}
 //Parameterized constructor
 public Person(String name, int age, String ContactNumber) {
    this.name = name;
    this.age = age;
    this.ContactNumber = ContactNumber;
 }


// Getters and Setters


public String getName() {
    return name;
} 

//Stter for name
public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

// Setter for age
public void setAge(int age) {
    this.age = age;
}

public String getContactNumber() {
    return ContactNumber;

}


//Setter for Contact number
public void setContactNumber(String ContactNumber) {
    this.ContactNumber = ContactNumber;
}
}