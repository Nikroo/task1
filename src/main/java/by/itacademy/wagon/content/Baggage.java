package by.itacademy.wagon.content;

public class Baggage {

    private double weight;
    private double size;

    public Baggage() {
    }

    public Baggage(double weight, double size) {
        this.weight = weight;
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
