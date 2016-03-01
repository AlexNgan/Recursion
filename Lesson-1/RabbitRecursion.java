import java.util.Scanner;
//Author: Gloria Ngan

public class RabbitRecursion{
  private long rabbits;       //Number of rabbits.
  
  //Method that reflects the Fibonacci sequence.
  public static long fib(int n){
    if(n == 0 || n == 1)
      return n;
    return fib(n-2) + fib(n-1);
  }
  
  public static long NumRabbits(int month){
    return fib(month + 1);
  }
  
  public static void main (String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("How many months have the rabbits been bangin'?");
    int x = scan.nextInt();
    System.out.println(NumRabbits(x));
  }
}
