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

public class GradeRegister {
    private ArrayList<Integer> grades;
    
    public GradeRegister() {
        this.grades = new ArrayList<>();
    }
    
    public void add(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }
    
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    
    public int sum() {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        return sum;
    }
    
    public double average() {
        return (double) this.sum()/ grades.size();
    }
    
    public int sumAboveGrade(int grade) {
        int sum = 0;
        for (int points : grades) {
            if (points >= grade) {
                sum += points;
            }
        }
        return sum;
    }
    
    public int getSizeAboveGrade(int grade) {
        int size = 0;
        for (int points : grades) {
            if (points >= grade) {
                size++;
            }
        }
        return size;
    }
    
    public double averageAboveGrade(int grade) {
        if (this.getSizeAboveGrade(grade) > 0) {
            return (double) sumAboveGrade(grade) / getSizeAboveGrade(grade); 
        }
        return -1;
    }
    
    public double percentageAboveGrade(int grade) {
        return 100.0 * this.getSizeAboveGrade(grade) / this.getSizeAboveGrade(0);
    }
    
    public void printer() {
        int[] register = {0, 0, 0, 0, 0, 0};

        for (int grade : this.grades) {
            if (grade < 50) {
                register[0]++;
            } else if (grade < 60) {
                register[1]++;
            } else if (grade < 70) {
                register[2]++;
            } else if (grade < 80) {
                register[3]++;
            } else if (grade < 90) {
                register[4]++;
            } else {
                register[5]++;
            }
        }
        
         for (int i = (register.length - 1); i >= 0; i--) {
            String stars = "";
            int count = register[i];
            for (int j = count; j > 0; j--) {
                stars += "*";
            }
            System.out.println(i + ": " + stars);
        }
    }
}
