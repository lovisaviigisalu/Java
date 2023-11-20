package week8.Exercise11;
import java.util.ArrayList;
import java.util.List;
public class Box implements ToBeStored {
    private double maxweight;
    private List<ToBeStored> items;

    public Box(double maxweight){
        this.maxweight = maxweight;
        this.items = new ArrayList<>();
    }
    public void add(ToBeStored item) {
        if (weight() + item.weight() <= maxweight) {
            items.add(item);
        }
    }
    @Override
    public double weight() {
        double totalWeight = 0;
        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}
