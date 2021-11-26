
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeRegister grades = new GradeRegister();
        //Write your program here -- consider breaking the program into 
        //multiple classes.
        
        UserInterface ui = new UserInterface(grades, scanner);
        ui.start();
        

        
    }
}
