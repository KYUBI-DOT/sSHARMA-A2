import java.util.LinkedList;
import java.util.Queue;

public class Ride implements RideInterface {
    private final String rideName;
    private final int capacity;
    private final Employee rideOperator;
    private final Queue<Visitor> visitorQueue;
    private final LinkedList<Visitor> rideHistory;

    public Ride(String rideName, int capacity, Employee rideOperator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
        this.visitorQueue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Getter methods for the fields
    public String getRideName() {
        return rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    // Interface Methods
    @Override
    public void addVisitorToQueue(Visitor visitor) {
        visitorQueue.add(visitor);
        System.out.println("Visitor added to queue: " + visitor.getName());
    }

    @Override
    public void removeVisitorFromQueue() {
        if (!visitorQueue.isEmpty()) {
            Visitor removedVisitor = visitorQueue.poll();
            System.out.println("Visitor removed from queue: " + removedVisitor.getName());
        } else {
            System.out.println("Queue is empty. No visitor to remove.");
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Current Visitors in Queue:");
        for (Visitor visitor : visitorQueue) {
            System.out.println(visitor.getName());
        }
    }

    @Override
    public void runOneCycle() {
        int visitorsToBoard = Math.min(visitorQueue.size(), capacity);
        System.out.println("Running one cycle with " + visitorsToBoard + " visitors.");

        for (int i = 0; i < visitorsToBoard; i++) {
            Visitor visitor = visitorQueue.poll();
            rideHistory.add(visitor);
            System.out.println("Visitor " + visitor.getName() + " has completed the ride.");
        }

        // Optionally, print the ride history after each cycle
        printRideHistory();
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        rideHistory.add(visitor);
        System.out.println("Visitor added to ride history: " + visitor.getName());
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        return rideHistory.contains(visitor);
    }

    @Override
    public int numberOfVisitors() {
        return rideHistory.size();
    }

    @Override
    public void printRideHistory() {
        System.out.println("Visitors in Ride History:");
        for (Visitor visitor : rideHistory) {
            System.out.println(visitor.getName());
        }
    }

    // You can also provide other utility methods that operate on rideHistory
    public void printTotalNumberOfVisitors() {
        System.out.println("Total number of visitors who have ridden: " + rideHistory.size());
    }
}
