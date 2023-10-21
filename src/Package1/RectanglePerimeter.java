package Package1;

public class RectanglePerimeter {
    public static void main(String[] args) {
        double length = 7;  // Length of the rectangle
        double width = 10;  // Width of the rectangle

        double perimeter = calculateRectanglePerimeter(length, width);

        System.out.println("The perimeter of the rectangle is: " + perimeter);
    }

    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
}

