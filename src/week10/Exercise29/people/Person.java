package week10.Exercise29.people;

public class Person {
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return  name + '\n' + ' ' + address;
    }
}
