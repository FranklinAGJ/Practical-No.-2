class FibonacciSeries {
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }
        int a = 0, b = 1;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        printFibonacci(10); 
    }
}