package week8.Exercise12;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> basket;
    public ShoppingBasket() {
        this.basket = new HashMap<>();
    }
    public void add(String product, int price){
        Purchase existing = basket.get(product);
        if (existing == null) {
            Purchase newPurchase = new Purchase(product, 1, price);
            basket.put(product, newPurchase);
        }else {
            existing.increaseAmount();
        }
    }
    public int price(){
        return basket.values().stream().mapToInt(Purchase :: price).sum();
    }
    public void print() {
        for (Purchase purchase : basket.values()) {
            System.out.println(purchase);
        }
    }

}
