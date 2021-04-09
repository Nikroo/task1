package by.itacademy.wagon.content;

public class Passenger {

    private String firstName;
    private String lastName;
    private int id;
    private Baggage baggage;

    public Passenger() {
    }

    public Passenger(String firstName, String lastName, int id, Baggage baggage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.baggage = baggage;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}
