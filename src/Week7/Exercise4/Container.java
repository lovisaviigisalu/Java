package Week7.Exercise4;
import java.util.ArrayList;

public class Container {
    private ArrayList<Suitcase> suitcases;
    private int maximum;
    public Container(int maximum){
        this.maximum = maximum;
        this.suitcases =new ArrayList<Suitcase>();
    }
    public void addSuitcase(Suitcase suitcase) {
        if (totalWeight() + suitcase.totalWeight() <= maximum) {
            suitcases.add(suitcase);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;

        for (Suitcase suitcase : suitcases) {
            totalWeight += suitcase.totalWeight();
        }
        return totalWeight;
    }
    public String toString() {
        int totalWeight = totalWeight();
        int suitcaseCount = suitcases.size();

        return suitcaseCount + " suitcase" + " (" + totalWeight + " kg)";
    }
    public void printThings() {
        for (Suitcase suitcase : suitcases) {
            suitcase.printThings();
        }
    }
}
