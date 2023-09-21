package week2;

public class Exercise39 {
    public static void printStars(int amount){
        int times = 0;
        while(times<amount){
        System.out.print("*");
        times ++;}
        System.out.println();
    }
    public static void printSquare(int sidesize){
        int rows = 0;
        while (rows<sidesize){
            printStars(sidesize);
            rows++;
        }
    }
    public static void printRectangle(int width, int height){
        int rows = 0;
        while (rows<height){
            printStars(width);
            rows++;
        }
    }
    public static void printTriangle(int size){
        int rows=0;
        int stars = 0;
        while (rows<size){
            stars +=1;
            printStars(stars);
            rows++;
        }
    }
    public static void main (String[] args){
        printStars(3);
        printRectangle(17,3);
        printSquare(4);
        printTriangle(6);
    }
}
