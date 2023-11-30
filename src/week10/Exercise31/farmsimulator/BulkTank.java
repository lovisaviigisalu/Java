package week10.Exercise31.farmsimulator;

public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000.0;
        this.volume = 0.0;
    }
    // Constructor with a custom capacity
    public BulkTank(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            // Set default capacity if given capacity is invalid
            this.capacity = 2000.0;
        }
        this.volume = 0.0;
    }
    //// Getter for the tank capacity
    public double getCapacity() {
        return capacity;
    }
    // Getter for the current volume of the tank
    public double getVolume() {
        return volume;
    }
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    // Method to add milk to the tank
    public void addToTank(double amount) {
        if (amount > 0) {
            this.volume += Math.min(amount, howMuchFreeSpace());
        }
    }

    // Method to take a specific amount of milk from the tank
    public double getFromTank(double amount) {
        if (amount < 0) {
            return 0;
        }
        double taken = Math.min(amount, this.volume);
        this.volume -= taken;
        return taken;
    }

    @Override
    public String toString() {
        return String.format("%.1f/%.1f", Math.ceil(this.volume), Math.ceil(this.capacity));
    }
}
