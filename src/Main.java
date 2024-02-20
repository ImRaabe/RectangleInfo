import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double height;
        double width;

        do {
            System.out.print("Please enter the height of the rectangle: ");
            height = in.nextDouble();
        } while (height <= 0);

        do {
            System.out.print("Please enter the width of the rectangle: ");
            width = in.nextDouble();
        } while (width <= 0);

        double area = height * width;
        double perimeter = 2 * (height + width);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The diagonal of the rectangle is: " + diagonal);
    }
}