package week10.Exercise29.people;

public class Student extends Person {
    private int credits;

    public Student(String name, String address)
    {
        //With super, it takes name and address value from Person class
        super(name, address);
        //at the beginning student have 0 credits;
        this.credits = 0;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        credits++;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  credits " + credits;
    }
}
