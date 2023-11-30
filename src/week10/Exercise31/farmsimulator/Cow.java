package week10.Exercise31.farmsimulator;
import java.util.*;

public class Cow implements Milkable, Alive {
    private double milkAmount;
    private double udderCapacity;
    private String name;
    //name variants
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    // Constructor to create a cow with a random name
    public Cow() {
        //chooses random name and udder capacity
        this.name = getRandomName();
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.milkAmount = 0.0;
    }

    // Getting the cow's name
    public String getName() {
        return this.name;
    }

    // Getting the udder capacity
    public double getCapacity() {
        return this.udderCapacity;
    }

    // Getter for the milk amount
    public double getAmount() {
        return this.milkAmount;
    }

    // Method to simulate living for an hour

    public void liveHour() {
        double milkProduction = 0.7 + new Random().nextDouble() * 1.3;
        if (milkProduction + this.milkAmount <= this.udderCapacity) {
            this.milkAmount += milkProduction;
        } else {
            this.milkAmount = this.udderCapacity;
        }
    }

    // Method to simulate milking the cow
    public double milk() {
        double milkToBeMilked = this.milkAmount;
        this.milkAmount = 0.0;
        return milkToBeMilked;
    }

    // Overridden toString method to describe the cow
    @Override
    public String toString() {
        return String.format("%s %.1f/%.1f", this.name, Math.ceil(this.milkAmount), this.udderCapacity);
    }

    // Method to get a random name from the NAMES array
    private String getRandomName() {
        return NAMES[new Random().nextInt(NAMES.length)];
    }
}
