package week10.Exercise28.movable;

import java.util.List;
import java.util.ArrayList;
public class Group implements Movable{
    private List<Movable> groups;

    public Group() {
        this.groups = new ArrayList<>();
    }
    public String toString() {
        //Using a StringBuilder to build the string representation
        StringBuilder result = new StringBuilder();
        //Takes every menber of the group and appends their string representation to the result.
        for (Movable member : groups) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
    public void addToGroup(Movable movable) {
        // Adds the provided movable object to the list of groups.
        groups.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        // Iterate through each member in the group and move them based on the values.
        for (Movable member : groups) {
            member.move(dx, dy);
        }
    }
}
