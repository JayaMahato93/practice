package july_06;

import java.util.Scanner;

public class PrintMethLogic {
    public static void main(String[] args) {
        int x;
        int y;
        int a;
        int m;
        int s;
        int d;
        int mod;
        Scanner scanner =new Scanner(System.in);
        System.out.print("Input First Number: ");
        x = scanner.nextInt();
        System.out.print("Input Second Number: ");
        y = scanner.nextInt();
        a = x+y;
        System.out.println("Expected Output of Sum: "+a);
        m =x*y;
        System.out.println("Expected Output of Multiplication: "+m);
        s = x-y;
        System.out.println("Expected Output of Sub: "+s);
        d =x/y;
        System.out.println("Expected Output of Div: "+d);
        mod =x%y;
        System.out.println("Expected Output of Mod: "+mod);
    }
}
