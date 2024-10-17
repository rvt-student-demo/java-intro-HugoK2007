package lv.rvt;

import java.util.*;

public class App 
{

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        divisibleByThreeInRange(n1, n2);

    }

    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
        
    
    

   
        
    

