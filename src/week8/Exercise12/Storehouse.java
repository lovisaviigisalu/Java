package week8.Exercise12;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Storehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        prices.put(product, price);
        stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }
    public int stock(String product){
        return stocks.getOrDefault(product, 0);
    }
    public boolean take(String product) {
        int current = stocks.getOrDefault(product, 0);

        if (current > 0) {
            stocks.put(product, current - 1);
            return true;
        }

        return false;
    }
    public Set<String> products(){
        return prices.keySet();
    }

};

