import java.util.InputMismatchException;
import java.util.Scanner;

class TriangleType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter side 1: ");
            int a = scanner.nextInt();
            System.out.print("Enter side 2: ");
            int b = scanner.nextInt();
            System.out.print("Enter side 3: ");
            int c = scanner.nextInt();
            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("All sides must be positive integers.");
            } else if (a + b > c && b + c > a && a + c > b) {
                String triangleType = getTriangleType(a, b, c);
                System.out.println(triangleType);
            } else {
                System.out.println("Not a triangle");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }

    private static String getTriangleType(int a, int b, int c) {
        if (a == b && b == c) {
            return "Equilateral triangle";
        } else if (a == b || b == c || a == c) {
            return "Isosceles triangle";
        } else {
            return "Scalene triangle";
        }
    }
}