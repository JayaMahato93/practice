package july_06;

import java.util.Scanner;

public class AverageOfTheNumber {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        int avg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("A: ");
        a = scanner.nextInt();
        System.out.print("B: ");
        b = scanner.nextInt();
        System.out.print("C: ");
        c = scanner.nextInt();
        System.out.print("D: ");
        d = scanner.nextInt();
        System.out.print("E: ");
        e = scanner.nextInt();
        avg =((a+b+c+d+e)/5);
        System.out.println("Avg: "+avg);
    }
}
