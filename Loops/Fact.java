
    import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;      // to hold the number
        int fact = 1; // to hold factorial result

        System.out.print("Enter any positive integer: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);
    }
}


