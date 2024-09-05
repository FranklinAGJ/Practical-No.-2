class ExpenseCalculator 
{
    int quantity;
    double unitPrice;

    public void setValue(int quantity, double unitPrice) 
{
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calculateTotal() 
{
        double total = unitPrice*0.9;

        // Apply the discount if the quantity is greater than 1000
        if (quantity >= 1000) 
{
            total *= 0.9; // 10% discount
        }

        return total;
    }

    public void displayTotal() 
{
        System.out.println("Total Cost: " + calculateTotal());
    }
}

public class ExpenseCalculatorDemo 
{
    public static void main(String[] args) 
{
        ExpenseCalculator calculator = new ExpenseCalculator();
        int quantity = Integer.parseInt(args[0]);
        double unitPrice = Double.parseDouble(args[1]);
        calculator.setValue(quantity, unitPrice);
        calculator.displayTotal();
    }
}