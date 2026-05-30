//Class name and file name should be same

import java.util.Scanner;

class Example03_AddTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int b = sc.nextInt();
        int c = a + b;
        //Print f is the formated string output
        System.out.printf("Sum of %d and %d is %d", a, b, c);
        sc.close();
    }
}
