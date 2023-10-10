package week5.Exercise93;
import java.util.Calendar;
import java.time.LocalDate;
public class Person {
    private MyDate getCurrentDate(){

        int day = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        return new MyDate(day, month, year);
    }
    private String name;
    private MyDate birthday;

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    public Person (String name) {
        this.name = name;
        this.birthday = getCurrentDate();
    }

    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public int age() {
        //tänase kuupäeva andmed
        int date = Calendar.getInstance().get(Calendar.DATE);
        int month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        // toob MyDate kasutaja sisestatud andmed
        int birthYear = birthday.getYear();
        int birthMonth = birthday.getMonth();
        int birthDay = birthday.getDay();
        //arvutan vanuse
        int age = year - birthYear;

        return age;
    }
    public boolean olderThan(Person compared) {

        if (this.birthday.getYear() < compared.birthday.getYear()) {
            return true;
        } else if (this.birthday.getYear() > compared.birthday.getYear()) {
            return false;
        } else {
            // Kui peaks olema kaks samal aastal syndinut, siis vordleb programm kuid
            if (this.birthday.getMonth() < compared.birthday.getMonth()) {
                return true;
            } else {
                return false;
            }
        }
    }


        public String getName() {
        return this.name;
    }

    public String toString() {
        return name + ", born " + birthday.toString();
    }


}
