package week8.Exercise9;

public class Main {
    public static void main(String[] args) {
        VehicleRegister register = new VehicleRegister();

        RegistrationPlate reg1 = new RegistrationPlate("FI", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("FI", "UXE-465");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        register.add(reg1, "Peeter");
        register.add(reg2,"Liisa");
        register.add(reg3, "Jürgen");

        System.out.println("Owner of plate1: " + register.get(reg1));
        System.out.println("Owner of plate2: " + register.get(reg2));
        System.out.println("Owner of plate3: " + register.get(reg3));

        register.delete(reg2);

        //prindib plates
        register.printRegistrationPlates();
        System.out.println("Owners:");
        //prindib omanikud
        register.printOwners();
    }
}
