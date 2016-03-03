/*
 * This is a program that solves a Tower of Hanoi
 * game given the number of disks to solve for,
 * using a recursive process.
 */ 


public class Hanoi{
  public static void main(String[] args){
   int nDisks = 3;
   doTowers(nDisks, 'A', 'B', 'C');
  }
  
  
  public static void doTowers(int topNum, char from, char inter, char to){
    //If there is only one disk; base case.
    if(topNum == 1){
      System.out.println("Disk 1 from " + from + " to " + to);
    }else{
      doTowers(topNum - 1, from, to, inter);     //Else, recursive process.
      System.out.println("Disk " + topNum + " from " + from + " to " + to);
      doTowers(topNum - 1, inter, from, to);
    }
  }
}
