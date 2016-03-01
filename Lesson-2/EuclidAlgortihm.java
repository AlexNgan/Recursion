import java.util.Scanner;
/* Author: Gloria Ngan
 * 
 * This is a program that finds the GCT of two integers
 * using Euclids algorithm.
 */

public class EuclidAlgorithm{
  //Method to find the GCF.
  public static int GreatestCommonFactor(int x, int y){
    while(x != y){
      if(x > y)
        x = x - y;
      else if(x < y)
        y = y - x;
    }
    return x;
  }
  
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the first number.");
    int a = scan.nextInt();
    System.out.print("Enter the second number.");
    int b = scan.nextInt();
    
    System.out.println(GreatestCommonFactor(a, b));
    
    scan.close();
  }
}
