package lv.rvt;

import java.util.*;

public class App 
{

  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int temp;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
    for(int i = 0; i < val.length / 2; i++) {
      // Swapping the elements
      int j = val[i];
      val[i] = val[val.length - i - 1];
      val[val.length - i - 1] = j;
  }
 
    
 
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}