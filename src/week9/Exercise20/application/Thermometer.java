package week9.Exercise20.application;



import java.util.Random;

public class Thermometer implements Sensor {
    private boolean isOn;
    private Random random;

    public Thermometer() {
        this.isOn = false;
        this.random = new Random();
    }

    @Override
    public int measure() {
        if (!isOn) {
            throw new IllegalStateException("Thermometer is off");
        }
        return random.nextInt(61) - 30; // Random number between -30 and 30
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }
}