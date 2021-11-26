/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Todo
 */
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private GradeRegister grades;
    private Scanner scanner;
    
    public UserInterface (GradeRegister grades, Scanner scanner) {
        this.grades = grades;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter total points, -1 stops:");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }
            
            grades.add(input);
        }
        System.out.println("Point average (all): " + grades.average());
        
        if(grades.averageAboveGrade(50) == -1) {
            System.out.println("Point average (passing): - ");
        } else {
            System.out.println("Point average (passing): " + grades.averageAboveGrade(50));
        }
        

        System.out.println("Pass percentage: " + grades.percentageAboveGrade(50));
        System.out.println("Grade distribution: ");
        grades.printer();
    }
}
