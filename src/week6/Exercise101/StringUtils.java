package week6.Exercise101;

public class StringUtils {
    public static boolean included(String word, String searched) {
        if (word == null || searched == null) {
            return false;
        }

        // Normalize and make the comparison case-insensitive
        String normalizedWord = word.trim().toLowerCase();
        String normalizedSearched = searched.trim().toLowerCase();

        return normalizedWord.contains(normalizedSearched);
    }
}




