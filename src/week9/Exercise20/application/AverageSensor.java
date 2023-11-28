package week9.Exercise20.application;
import week9.Exercise20.application.Sensor;
import java.util.*;
class AverageSensor implements Sensor {
    private List<Sensor> sensors;
    private List<Integer> readings;
    private boolean isOn;

    // Constructor
    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
        this.isOn = false;
    }

    // Method to add a new sensor to the AverageSensor
    public void addSensor(Sensor additional) {
        sensors.add(additional);
        // If the average sensor is already on, ensure the added sensor is on too
        if (isOn) {
            additional.on();
        }
    }

    // Implementation of the measure method
    public int measure() {
        if (!isOn || sensors.isEmpty()) {
            throw new IllegalStateException("AverageSensor is off or has no sensors");
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }

        // Calculate the average (rounded down as it is for integer division)
        int average = sum / sensors.size();

        // Save the reading to the list
        readings.add(average);

        return average;
    }

    // Implementation of the isOn method
    public boolean isOn() {
        return isOn;
    }

    // Implementation of the on method
    public void on() {
        // Turn on all sensors if they are not already on
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                sensor.on();
            }
        }
        isOn = true;
    }

    // Implementation of the off method
    public void off() {
        // Turn off all sensors
        for (Sensor sensor : sensors) {
            sensor.off();
        }
        isOn = false;
    }

    // New method to retrieve the list of readings
    public List<Integer> readings() {
        return new ArrayList<>(readings);
    }
}