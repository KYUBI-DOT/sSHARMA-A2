//Abstract class
public abstract class person {
    private String name;
    private int age;
    private String ContactNumber;


 // Default constructor which performs nothing
 public person{
    
}
 //Parameterized constructor
 public person(String name, int age, String ContactNumber) {
    this.name = name;
    this.age = age;
    this.email = email;
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
    retun ContactNumber;
}


//Setter for Contact number
public void setContactNumber(String ContactNumber) {
    this.ContactNumber = ContactNumber;
}
}