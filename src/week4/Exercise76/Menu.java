package week4.Exercise76;
import java.util.ArrayList;
public class Menu {
        private ArrayList<String> meals;
        public Menu() {
            this.meals = new ArrayList<String>();
        }
        public void addMeal(String meal){
        meals.add(meal);
        }
        public void printMeals(){
            for (String meal : this.meals){
            System.out.println(meal);
            }
        }
        public void clearMenu(){
            meals.clear();
        }
        public static void main(String[] args){
            Menu menu = new Menu();
            menu.addMeal("Hamburger");
            menu.addMeal("Fish'n'Chips");
            menu.addMeal("Sauerkraut");

            menu.printMeals();

            menu.clearMenu();
        }
}

