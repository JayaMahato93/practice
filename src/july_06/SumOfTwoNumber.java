package july_06;

import java.util.Scanner;

public class SumOfTwoNumber {
   public static void main(String[] args){
       int x;
       int y;
       int output;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the value of X: ");
       x = scanner.nextInt();
       System.out.print("Enter the value of Y: ");
       y = scanner.nextInt();
       output = x+y ;
       System.out.print("Expected Output: "+output);

   }
}
