package Week7.Exercise4;
import java.util.ArrayList;
public class Suitcase {
    private int maximum;
    private ArrayList<Thing> things;

    public Suitcase(int maximum){
        this.maximum = maximum;
        this.things = new ArrayList<Thing>();
    }
    public void addThing(Thing thing){
        things.add(thing);
    }
    public String toString() {
        int kogukaal = 0;
        for (Thing thing : things) {
            kogukaal += thing.getKaal();
        }
        return things.size() + " things (" + kogukaal + " kg)";
    }
    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }
    public int totalWeight() {
        int totalWeight = 0;
        for (Thing thing : things) {
            totalWeight += thing.getKaal();
        }
        return totalWeight;
    }
    public Thing heaviestThing(){
        Thing raskeim_asi = things.get(0);
        for (Thing thing : things){
            if (thing.getKaal() > raskeim_asi.getKaal()){
                raskeim_asi = thing;
            }
        }
        if (things.isEmpty()){
            return null;
        }
        return raskeim_asi;


    }
}
