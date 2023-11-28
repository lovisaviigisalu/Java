package week9.Exercise25.tools;
import java.util.*;
import week9.Exercise25.DuplicateRemover;

public class PersonalDuplicateRemover implements DuplicateRemover {
    // Container for storing only unique character strings
    private Set<String> uniqueCharacterStrings;
    // Counter to keep track of the detected duplicates
    private int detectedDuplicates;

    public PersonalDuplicateRemover() {
        this.uniqueCharacterStrings = new HashSet<>();
        this.detectedDuplicates = 0;
    }
    // Adds a character string if it is not already in the container
    @Override
    public void add(String characterString) {
        if (uniqueCharacterStrings.contains(characterString)) {
            //and increments the counter accordingly
            detectedDuplicates++;
        } else {
            uniqueCharacterStrings.add(characterString);
        }
    }
    // Returns the number of detected duplicates
    @Override
    public int getNumberOfDetectedDuplicates() {
        return detectedDuplicates;
    }
    // Returns a new container containing all unique character strings
    @Override
    public Set<String> getUniqueCharacterStrings() {
        return new HashSet<>(uniqueCharacterStrings);
    }
    // Clears the container and resets the counter
    @Override
    public void empty() {
        uniqueCharacterStrings.clear();
        detectedDuplicates = 0;
    }
}
