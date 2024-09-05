import java.util.Scanner;

public class TriangleTypeZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side a: ");
        int a = scanner.nextInt();
        System.out.print("Enter side b: ");
        int b = scanner.nextInt();
        System.out.print("Enter side c: ");
        int c = scanner.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            if (a == b && b == c) {
                System.out.println("The triangle is equilateral.");
            } else if (a == b || b == c || a == c) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scaling.");
            }
        } else {
            System.out.println("The sides cannot form a triangle.");
        }
    }
}
