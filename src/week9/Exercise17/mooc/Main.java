package week9.Exercise17.mooc;

import week9.Exercise17.mooc.logic.ApplicationLogic;
import week9.Exercise17.mooc.ui.TextUserInterface;
import week9.Exercise17.mooc.ui.UserInterface;

public class Main {
    public static void main(String[]args){
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
