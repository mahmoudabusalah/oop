package oop.general;

import java.util.Scanner;

public class Shape1 {
    public static void main(String arg[]) {
        Scanner val = new Scanner(System.in);
        System.out.print("Pleas Enter Number: ");
        int n = val.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
                if (j != i) System.out.print(' ');
            }
            System.out.println();
        }
    }
}
