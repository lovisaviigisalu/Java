package week1;
//arvutab sekundid yhes aastas
public class Exercise5 {
    public static void main(String[] args) {
        //aastas on 365 paeva, paevas 24 tundi, tunnis 60 minutit ja minustis 60 sekundit. Korrutan need omavahel
        int days=365;
        int hoursinday=24;
        int minutesinhour=60;
        int secondsinminute = 60;
        int secondsinayear = days * hoursinday * minutesinhour * secondsinminute;
        System.out.print(secondsinayear);
    }
}
