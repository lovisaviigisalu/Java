package week3;
import java.util.ArrayList;
import java.util.Collections;

public class Exercise62 {

    public static void removeLast(ArrayList<String> list){
        list.remove(list.size()-1);
    }

    public static void main(String[] args){
        ArrayList<String> brothers = new ArrayList<String>();
        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Michael");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);
        // paneb listi tahestikulisse jarjekorda
        Collections.sort(brothers);
        //votab ara viimase listi nimekirjas oleva nime
        removeLast(brothers);

        System.out.println(brothers);

    }
}
