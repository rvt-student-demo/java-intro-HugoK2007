package lv.rvt;

import java.util.*;

public class App 
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
          
            System.out.println("How many times?");
            int amount = scanner.nextInt();
    
            for (int i = 0; i < amount; i++) {
                printText();
            }
        }
    
        public static void printText() {
            System.out.println("In a hole in the ground there lived a method");
        }
    }
        
    
    

   
        
    

