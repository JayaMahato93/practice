package july_06;

import java.util.Scanner;

public class CirclePerimeterArea {
    public static void main(String[] args) {
        double radius;
        double perimeter;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        radius =scanner.nextDouble();
        perimeter = 2*Math.PI*radius;
        System.out.println("Perimeter is: "+perimeter);
        area = Math.PI*radius*radius;
        System.out.println("Area is: "+area);
    }
}
