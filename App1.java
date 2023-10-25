import java.util.Scanner;

public class App1 {
    public static void main(String arg[]) {
        Scanner val = new Scanner(System.in);
        int n1, n2, choice;
        System.out.print("Please Enter Number 1 : "); n1 = val.nextInt();
        System.out.print("Please Enter number 2: "); n2 = val.nextInt();
        System.out.print("Please Enter  You Are Choice(1 || 2 || 3 || 4 ): "); choice = val.nextInt();

        int ans;
        if (choice == 1) ans = n1 + n2;
        else if (choice == 2) ans = n1 - n2;
        else if (choice == 3) ans = n1 * n2;
        else if (choice == 4) {
            if (n2 != 0) ans = n1 / n2;
            else {
                System.out.println("Division by zero DNE.");
                return;
            }
        } else {
            System.out.println("Just You Can Choice 1 || 2 || 3 || 4 .");
            return;
        }
        System.out.println("Result: " + ans);
    }
}
