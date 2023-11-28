package week9.Exercise18.moving.domain;
public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }
    //method to get the item's volume
    @Override
    public Integer getVolume() {
        return volume;
    }
    //Method to get the item's name
    public String getName() {
        return name;
    }
    //method returns a formatted string with the item's name and volume
    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }
    //method to allow comparison of items based on their volume
    public int compareTo(Item otherItem) {
        return Integer.compare(this.getVolume(), otherItem.getVolume());
    }
}
