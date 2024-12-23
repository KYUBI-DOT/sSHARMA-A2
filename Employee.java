//Employee class
//Extends the person class
 public class Employee extends person{
    private String jobTitle;
    private double salary;


//Parameterized consructor (also includes the variables from person class)
public Employee(String name, int age, String ContactNumber, String jobTitle, double salary) {
    super(name, age, ContactNumber);
    this.jobTitle = jobTitle;
    this.salary = salary;
}
//Getters and Setters

public String getjobTitle() {
    return jobTitle;
}

//Setter for jobTitle
public void setjobTitle(String jobTitle) {
    this.jobTitle = jobTitle;
}

public double getsalary() {
    return salary;
}

// Setter for salary
public void setSalary(double salary) {
    this.salary = salary;
}

//Override for the details of the employee
@Override
public String toString() {
    return super.toString() + ", jobTitle: " + jobTitle + ", salary: $" + salary;

}
 }