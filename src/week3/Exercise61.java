package week3;
import java.util.ArrayList;
public class Exercise61 {
    /*public static int countItems(ArrayList<String>programmingLanguages ){
       return programmingLanguages.size();//meetod loeb kokku, mitu elementi on listis ja tagastab selle numbri
    }*/

    public static void print(ArrayList<String> printed){
        //prindib valja listi
        for (String word:printed){
            System.out.println(word);
        }
    }

    public static void removeFirst(ArrayList<String> list){
        list.remove(0);
    }
    public static void main(String[] args){
        ArrayList<String> programmingLanguages = new ArrayList<String>();
        programmingLanguages.add("Pascal");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Ruby");
        programmingLanguages.add("C++");
        //valjastatakse, mitu elementi on listis
        //System.out.println("There are thin many items int the list: ");
        //System.out.println(countItems(programmingLanguages));
        //prindib valja listi
        print(programmingLanguages);
        System.out.println("");
        //eemaldab listist esimese elemendi
        removeFirst(programmingLanguages);
        //prindib uue listi, kus pole esimest elementi
        print(programmingLanguages);
    }
}
