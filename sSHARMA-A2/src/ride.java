import java.util.LinkedList;
import java.util.Queue;
//ride class
//represents ride
public class ride {
    private String rideName;
    private int capacity;
    private Employee rideOperator;

    private Queue<Visitor> visitorQueue;

    // Default constructor which performs nothing
    
    public ride() {
        visitorQueue = new LinkedList<>();
    }

    // Parameterized constructor
    public ride(String rideName, int capacity, Employee rideOperator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
        this.visitorQueue = new LinkedList<>();
    }

    // Getters and Setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }

    public Queue<Visitor> getVisitorQueue() {
        return visitorQueue;
    }
}
