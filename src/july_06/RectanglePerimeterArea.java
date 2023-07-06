package july_06;

import java.util.Scanner;

public class RectanglePerimeterArea {
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        double perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Width: ");
        width = scanner.nextDouble();
        System.out.print("Height: ");
        height = scanner.nextDouble();
        area = height*width;
        System.out.println("Area: "+area);
        perimeter = 2*(height+width);
        System.out.println("Perimeter: "+perimeter);
    }
}
