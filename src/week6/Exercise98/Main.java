package week6.Exercise98;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);
        int[] copied = copy(original);
        //Muudetud element
        copied[0] = 99;

        // Prindib
        System.out.println("original: " + Arrays.toString(original));
        System.out.println("copied: " + Arrays.toString(copied));
        System.out.println("reversed: " + Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {
        // Uue array loomine
        int[] copied = new int[array.length];
        //
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        return copied;
    }
    public static int[] reverseCopy(int[] array) {
        // Uue array loomine
        int[] reversed = new int[array.length];
        //teeb nii, et seda arrayd hakatakse tagantpoolt valjastama
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }

        return reversed;
    }

}
