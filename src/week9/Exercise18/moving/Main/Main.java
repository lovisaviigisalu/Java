package week9.Exercise18.moving.Main;
import java.util.*;
import week9.Exercise18.moving.logic.Packer;
import week9.Exercise18.moving.domain.Box;
import week9.Exercise18.moving.domain.Item;
import week9.Exercise18.moving.domain.Thing;

public class Main {
    public static void main(String[] args) {
        // the things we want to pack
        List<Thing> things = new ArrayList<Thing>();
        things.add(new Item("passport", 2));
        things.add(new Item("toothbrash", 1));
        things.add(new Item("book", 4));
        things.add(new Item("circular saw", 8));

        // create a packer which uses boxes whose valume is 10
        Packer packer = new Packer(10);

        //packer will pack things into boxes
        List<Box> boxes = packer.packThings( things );

        System.out.println("number of boxes: "+boxes.size());

        for (Box box : boxes) {
            System.out.println("  things in the box: "+box.getVolume()+" dm^3");
        }

    }
}
