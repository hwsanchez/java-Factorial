import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer between 1 and 25: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: "+ factorial(n));
        sc.close();
    }

    public static int factorial(int n) {
        if(n == 0) return 1; // Base case
        return n * factorial(n-1); //Recursive case
    }
}
