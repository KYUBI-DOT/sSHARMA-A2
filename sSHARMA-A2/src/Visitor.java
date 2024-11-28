import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Visitor extends Person {
    private String ticketNumber;  // unique number
    private boolean isVip; // checks if it is vip or not
    private LocalDate dateVisited; // provides the date visited
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    // Default constructor
    public Visitor(String alice, int par, String female, String tickeT001, boolean par1) {
    }

    // Parameterized constructor
    public Visitor(String name, int age, String ContactNumber, String ticketNumber, boolean isVip, String dateVisited) {
        super(name, age, ContactNumber); // Calls the constructors from the parent class
        this.ticketNumber = ticketNumber;
        this.isVip = isVip;
        setdateVisited(dateVisited);
    }

    // Getter for ticketNumber
    public String getTicketNumber() {
        return ticketNumber;
    }

    // Setter for ticketNumber
    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    // Getter for isVip
    public boolean isVip() {
        return isVip;
    }

    // Setter for isVip
    public void setVip(boolean vip) {
        isVip = vip;
    }

    // Getter for dateVisited
    public LocalDate getDateVisited() {
        return dateVisited;
    }

    // Setter for dateVisited with validation
    public void setdateVisited(String dateVisited) {
        try {
            this.dateVisited = LocalDate.parse(dateVisited, DATE_FORMATTER);
        } catch (Exception e) {
            System.err.println("Invalid date format. Expected format: yyyy-MM-dd");
            this.dateVisited = null; // Set to null if the parsing fails
        }
    }

    // Override toString for better readability
    @Override
    public String toString() {
        return "Visitor [" +
                " Name= " + super.getName() +
                ", Age= " + super.getAge() +
                ", contactNumber='" + getContactNumber()  +
                ", TicketNumber= " + ticketNumber +
                ", VisitDate= " + dateVisited +
                ']';
    }
}
