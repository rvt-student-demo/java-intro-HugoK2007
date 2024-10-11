package lv.rvt;

import java.util.*;

public class App 
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
          
            int sum = 0;
            
            System.out.println("Give numbers:");
            while (true) {
                int num = scanner.nextInt();
    
                if (num == -1) {
                    System.out.println("Thx! Bye!");
                    break;
                }
    
                sum += num;
                
               
                
    
            }
    
            System.out.println("Sum: " + sum);
          
        }
    }
           
        
    
    

   
        
    

