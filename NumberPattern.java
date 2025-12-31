import java.util.Scanner;

public class NumberPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of rows
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {

            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Move to next line after each row
            System.out.println();
        }

        sc.close();
    }
}
