package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Grade: ");
        int points = Integer.valueOf(scanner.nextLine());

    
        if (points >= 100) {
            System.out.println("Perfect");
        } else if (points >= 90) {
            System.out.println("5."); 

        } else if (points >= 80) {
            System.out.println("4.");

        } else if (points >= 70) {
            System.out.println("3.");

        } else if (points >= 60) {
            System.out.println("2.");

        } else if (points >= 50) {
            System.out.println("1.");

        } else if (points <= 49) {
            System.out.println("failed.");

        } else if (points <= 0) {
            System.out.println("IMPOSSIBLE");
        }
        // code ends
        
    }
}
