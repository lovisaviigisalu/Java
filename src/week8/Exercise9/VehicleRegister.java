package week8.Exercise9;
import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;

    public VehicleRegister() {
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    //Uue lisamine
    public boolean add(RegistrationPlate plate, String owner) {
        //Kontrollitakse, kas number on juba olemas
        if (!owners.containsKey(plate)) {
            // Lisatakse number ja omanik registerisse
            owners.put(plate, owner);
            return true;
        }
        return false;
    }
    //omaniku leidmine
    public String get(RegistrationPlate plate) {
        return owners.get(plate);
    }
    //kustutamine
    public boolean delete(RegistrationPlate plate) {
        if (owners.containsKey(plate)) {
            owners.remove(plate);
            return true;
        }
        return false;
    }
    //Valjastatakse registris olevad numbrid
    public void printRegistrationPlates() {
        for (RegistrationPlate plate : owners.keySet()) {
            System.out.println(plate);
        }
    }
    //Valjastatakse registris olevad omanikud
    public void printOwners() {
        //Uus HashSet omanike jaoks
        HashSet<String> IndividualOwners = new HashSet<>(owners.values());

        for (String owner : IndividualOwners) {
            System.out.println(owner);
        }
    }
}