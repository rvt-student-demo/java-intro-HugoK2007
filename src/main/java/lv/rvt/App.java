package lv.rvt;

import java.util.*;

public class App 
{

  public static void main ( String[] args )
  {
    int[] valA   = { 13, -22,  82,  17}; 
    int[] valB   = {  -10,   31,   -77,   -9};
    
    // Put values into valB so that the sum of the values
    // in corresponding cells of valA and valB is 25.



 
 
    System.out.println( "valA: " 
        + valA[0] + " " + valA[1] + " " + valA[2] + " " + valA[3] );
 
    System.out.println( "valB: " 
        + valB[0] + " " + valB[1] + " " + valB[2] + " " + valB[3] );

    System.out.println( "sum:  " 
        + (valA[0]+valB[0]) + " " + (valA[1]+valB[1]) + " " 
        + (valA[2]+valB[2]) + " " + (valA[3]+valB[3]) );
   }
}