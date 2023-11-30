package week10.Exercise31.farmsimulator;
import java.util.*;
public class Farm  implements Alive{
    private String owner;
    private Barn barn;
    private Collection<Cow> animals;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        this.animals = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public Barn getBarn() {
        return barn;
    }

    public Collection<Cow> getHerd() {
        return animals;
    }
    public void addCow(Cow cow){
        animals.add(cow);
    }

    public void setHerd(Collection<Cow> herd) {
        this.animals = herd;
    }
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }

    public void manageCows() {
        if (animals != null) {
            barn.takeCareOf(animals);
        }
    }

    @Override
    public void liveHour() {
        if (animals != null) {
            for (Cow cow : animals) {
                cow.liveHour();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Farm owner: ").append(owner).append("\n");
        result.append("Barn bulk tank: ").append(barn.getBulkTank()).append("\n");
        if (animals == null || animals.isEmpty()) {
            result.append("No cows.");
        } else {
            result.append("Animals:\n");
            for (Cow cow : animals) {
                result.append("  ").append(cow).append("\n");
            }
        }
        return result.toString();
    }
}
