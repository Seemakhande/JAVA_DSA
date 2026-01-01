import java.util.Scanner;
public class InputSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A =scanner.nextInt();
        System.out.print("Enter second number: ");
        int B=scanner.nextInt();
        System.out.print("Enter third number: ");
        int C=scanner.nextInt();
        int sum = A + B + C;
        int avg=sum/3;
        System.out.println("The sum is: " + (sum));
        System.out.println("The average is: " + (avg));

    }
    
}
