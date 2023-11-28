package week9.Exercise18.moving.domain;

import java.util.*;

public class Box implements Thing {
    private int maxCapacity;
    private List<Thing> things;

    public Box(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.things = new ArrayList<>();
    }
    public boolean addThing(Thing thing) {
        if (getVolume() + thing.getVolume() <= maxCapacity) {
            things.add(thing);
            return true;
        } else {
            return false;
        }
    }

    public Integer getVolume() {
        int total = 0;
        for (Thing thing : things) {
            total += thing.getVolume();
        }
        return total;
    }

    @Override
    public String toString() {
       StringBuilder result = new StringBuilder("Things in the box: ");
       for (Thing thing: things){
           result.append(thing).append(", ");
       }
       return result.toString();
    }
}
