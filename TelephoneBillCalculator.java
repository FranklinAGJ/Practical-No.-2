
import java.util.Scanner;
public class TelephoneBillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the telephone number: ");
        String telephoneNumber = input.nextLine();
        System.out.print("Enter the number of calls made: ");
        int numberOfCalls = input.nextInt();
        double totalBill = 400.0; 
        if (numberOfCalls > 50) {
            totalBill += (numberOfCalls - 50) * 0.50; 
        }
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Total Bill: Rs " + totalBill);
        input.close();
    }
}
