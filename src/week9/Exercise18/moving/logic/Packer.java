package week9.Exercise18.moving.logic;
import week9.Exercise18.moving.domain.Box;
import week9.Exercise18.moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
    }
    public List<Box> packThings(List<Thing> things) {
        //Create a list for boxes
        List<Box> boxes = new ArrayList<>();

        for (Thing thing : things) {
            //New box for each thing
            Box currentBox = new Box(boxesVolume);
            //Add the thing to the box
            currentBox.addThing(thing);
            //Add the box to the list of boxes
            boxes.add(currentBox);
        }
        //return boxes
        return boxes;
    }
}
