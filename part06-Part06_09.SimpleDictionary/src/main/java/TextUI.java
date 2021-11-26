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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

	public TextUI (Scanner scanner, SimpleDictionary dictionary) {
		this.scanner = scanner;
		this.dictionary = dictionary;
	}

	public void start() {
		while (true) {
			System.out.println("Command: ");
			String command = scanner.nextLine();

			if (endEntered(command)) {			
				break;
			}

			if (addEntered(command)) {
				System.out.println("Word: ");
				String word = scanner.nextLine();
				System.out.println("Translation: ");
				String translation = scanner.nextLine();
				this.dictionary.add(word, translation);
                                continue;
			}

			if (searchEntered(command)) {
				System.out.println("To be translated: ");
				String toBe = scanner.nextLine();
                                if (dictionary.translate(toBe) != null) {
                                    System.out.println("Translation: " + dictionary.translate(toBe));
                                } else {
                                    System.out.println("Word " + toBe + " was not found");
                                }    
                                continue;
			}

			System.out.println("Unknown command");
		}
		System.out.println("Bye bye!")	;
		
	}
        
        public boolean endEntered(String word) {
            if (word.equals("end")) {
                return true;
            }
            return false;
        }
        
        public boolean addEntered(String word) {
            if (word.equals("add")) {
                return true;
            }
            return false;
        }

        public boolean searchEntered(String word) {
            if (word.equals("search")) {
                return true;
            }
            return false;
        }
     
}
