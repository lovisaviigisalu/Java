package week10.Exercise31.farmsimulator;
import java.util.Collection;
public class Barn{
        private BulkTank tank;
        private MilkingRobot robot;

        public Barn(BulkTank tank) {
            this.tank = tank;
            this.robot = null;
        }

        public BulkTank getBulkTank() {
            return tank;
        }

        public void installMilkingRobot(MilkingRobot milkingRobot) {
            this.robot = milkingRobot;
            milkingRobot.setBulkTank(tank);
        }

        public void takeCareOf(Cow cow) {
            if (robot == null) {
                throw new IllegalStateException("Milking robot not installed");
            }
            robot.milk(cow);
        }

        public void takeCareOf(Collection<Cow> cows) {
            for (Cow cow : cows) {
                takeCareOf(cow);
            }
        }

        @Override
        public String toString() {
            return "Barn: " + tank.toString();
        }
}


