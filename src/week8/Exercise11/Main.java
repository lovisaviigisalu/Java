package week8.Exercise11;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);
        Box box2 = new Box(5);

        box1.add(new Book("Fedor Dostojevski", "Crime and Punishment", 2));
        box1.add(new Book("Robert Martin", "Clean Code", 1));

        box2.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box2.add(new CD("Wigwam", "Nuclear Nightclub", 1975));

        Box bigBox = new Box(20);
        bigBox.add(box1);
        bigBox.add(box2);

        System.out.println(bigBox);
    }
}

