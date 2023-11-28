package week9.Exercise20.application;

public class ConstantSensor implements Sensor {
    private int number;

    public ConstantSensor(int number) {
        this.number = number;
    }

    public int measure() {
        return number;
    }

    public boolean isOn() {
        return true;
    }

    public void on(){}
    public void off(){}
}
