import java.util.*;

public class AssignmentTwo {
    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();

        // Running the parts as per the requirement
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        System.out.println("Part 3: Queue Interface");

        // Creating new Ride object
        Ride ride = new Ride("Roller Coaster", 3);

        // Creating new Visitor objects
        Visitor visitor1 = new Visitor("John", "Doe", 25);
        Visitor visitor2 = new Visitor("Jane", "Smith", 30);
        Visitor visitor3 = new Visitor("Alice", "Johnson", 22);
        Visitor visitor4 = new Visitor("Bob", "Brown", 28);
        Visitor visitor5 = new Visitor("Charlie", "Davis", 35);

        // Adding visitors to the queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);

        // Removing one visitor from the queue
        ride.removeVisitorFromQueue(visitor2);

        // Printing the queue
        ride.printQueue();
    }

    public void partFourA() {
        System.out.println("\nPart 4A: Collection Class (LinkedList)");

        // Creating new Ride object
        Ride ride = new Ride("Water Slide", 3);

        // Creating new Visitor objects
        Visitor visitor1 = new Visitor("John", "Doe", 25);
        Visitor visitor2 = new Visitor("Jane", "Smith", 30);
        Visitor visitor3 = new Visitor("Alice", "Johnson", 22);
        Visitor visitor4 = new Visitor("Bob", "Brown", 28);
        Visitor visitor5 = new Visitor("Charlie", "Davis", 35);

        // Adding visitors to the ride history (collection)
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Checking if a visitor is in the collection
        ride.checkVisitorFromHistory(visitor3);

        // Printing the number of visitors in the collection
        ride.numberOfVisitors();

        // Printing all visitors in the collection
        ride.printRideHistory();
    }

    public void partFourB() {
        System.out.println("\nPart 4B: Sorting the Collection");

        // Creating new Ride object
        Ride ride = new Ride("Ferris Wheel", 3);

        // Creating new Visitor objects
        Visitor visitor1 = new Visitor("John", "Doe", 25);
        Visitor visitor2 = new Visitor("Jane", "Smith", 30);
        Visitor visitor3 = new Visitor("Alice", "Johnson", 22);
        Visitor visitor4 = new Visitor("Bob", "Brown", 28);
        Visitor visitor5 = new Visitor("Charlie", "Davis", 35);

        // Adding visitors to the ride history (collection)
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Printing all visitors before sorting
        System.out.println("Before sorting:");
        ride.printRideHistory();

        // Sorting the visitors by their names using a custom comparator
        ride.sortRideHistory();

        // Printing all visitors after sorting
        System.out.println("\nAfter sorting:");
        ride.printRideHistory();
    }

    public void partFive() {
        System.out.println("\nPart 5: Run a Ride Cycle");

        // Creating new Ride object
        Ride ride = new Ride("Roller Coaster", 3);

        // Creating new Visitor objects
        Visitor visitor1 = new Visitor("John", "Doe", 25);
        Visitor visitor2 = new Visitor("Jane", "Smith", 30);
        Visitor visitor3 = new Visitor("Alice", "Johnson", 22);
        Visitor visitor4 = new Visitor("Bob", "Brown", 28);
        Visitor visitor5 = new Visitor("Charlie", "Davis", 35);
        Visitor visitor6 = new Visitor("Eve", "White", 27);
        Visitor visitor7 = new Visitor("Frank", "Green", 33);
        Visitor visitor8 = new Visitor("Grace", "Black", 21);
        Visitor visitor9 = new Visitor("Hannah", "Yellow", 26);
        Visitor visitor10 = new Visitor("Ian", "Blue", 29);

        // Adding visitors to the queue
        ride.addVisitorToQueue(visitor1);
        ride.addVisitorToQueue(visitor2);
        ride.addVisitorToQueue(visitor3);
        ride.addVisitorToQueue(visitor4);
        ride.addVisitorToQueue(visitor5);
        ride.addVisitorToQueue(visitor6);
        ride.addVisitorToQueue(visitor7);
        ride.addVisitorToQueue(visitor8);
        ride.addVisitorToQueue(visitor9);
        ride.addVisitorToQueue(visitor10);

        // Printing all visitors in the queue
        ride.printQueue();

        // Running one cycle
        ride.runOneCycle();

        // Printing all visitors in the queue after the cycle
        ride.printQueue();

        // Printing all visitors in the collection after the cycle
        ride.printRideHistory();
    }

    public void partSix() {
        System.out.println("\nPart 6: Writing to a File");

        // Creating new Ride object
        Ride ride = new Ride("Bumper Cars", 3);

        // Creating new Visitor objects
        Visitor visitor1 = new Visitor("John", "Doe", 25);
        Visitor visitor2 = new Visitor("Jane", "Smith", 30);
        Visitor visitor3 = new Visitor("Alice", "Johnson", 22);
        Visitor visitor4 = new Visitor("Bob", "Brown", 28);
        Visitor visitor5 = new Visitor("Charlie", "Davis", 35);

        // Adding visitors to the ride history (LinkedList)
        ride.addVisitorToHistory(visitor1);
        ride.addVisitorToHistory(visitor2);
        ride.addVisitorToHistory(visitor3);
        ride.addVisitorToHistory(visitor4);
        ride.addVisitorToHistory(visitor5);

        // Exporting ride history to a file
        ride.exportRideHistory();
    }

    public void partSeven() {
        System.out.println("\nPart 7: Reading from a File");

        // Creating new Ride object
        Ride ride = new Ride("Drop Tower", 3);

        // Importing ride history from the file
        ride.importRideHistory();

        // Printing the number of visitors in the collection
        ride.numberOfVisitors();

        // Printing all visitors in the collection
        ride.printRideHistory();
    }
}
