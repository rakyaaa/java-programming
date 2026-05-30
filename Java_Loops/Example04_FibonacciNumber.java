package Java_Loops;

public class Example04_FibonacciNumber{

    public static int fibonacci(int n){
        if(n <= 1)
            return 1;
        else
            return (fibonacci(n-1) + fibonacci(n-2));
    }
    public static void main(String[] args) {
        int n = 10;
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Iterative approach: ");
        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 0; i < n-2; i++){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
        //To find the fibonacci using recursive approach
        System.out.println();
        int num = 10;
        System.out.print("First " + num + " terms of Fibonacci Series(recursive):");
        System.out.print(" " + 0 + " ");
        for (int i = 0; i < num-1; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
    }
}