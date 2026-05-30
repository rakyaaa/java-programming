import java.util.Scanner;

public class Example4_SwapTwoNumbers {
    
    public static void swapTwoNumbersUsingThridVariable(int n1, int n2){
        int temp = n1;
        n1 = n2;
        n2= temp;
        System.out.println("First Number:- " + n1);
        System.out.println("Second Number:- "+ n2);
    }

    public static void swapTwoNumberswithoutThridVariable(int n1, int n2){
        n1 = n1 + n2;
        n2 = n1 - n2;
        n1 = n1 - n2;
        System.out.println("First Number:- " + n1);
        System.out.println("Second Number:- "+ n2);
    }

    public static void swapTwoNumberswithoutArithmeticOperator(int n1, int n2){
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("First Number:- " + n1);
        System.out.println("Second Number:- "+ n2);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number:- ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number:- ");
        int b = sc.nextInt();
        swapTwoNumbersUsingThridVariable(a, b);
        swapTwoNumberswithoutThridVariable(a, b);
        swapTwoNumberswithoutArithmeticOperator(a,b);
        sc.close();
    }
}
