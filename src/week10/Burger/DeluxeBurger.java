package week10.Burger;
import week10.Burger.*;
public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 19.10, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    // Override the additional topping methods to prevent additions
    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a Deluxe Burger.");
    }
    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
