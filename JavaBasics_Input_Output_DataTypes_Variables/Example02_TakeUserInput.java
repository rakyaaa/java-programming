import java.util.Scanner;

public class Example02_TakeUserInput {
    //To take the User input, We use the scanner class and System.in method

    public static void main(String[] args) {
        
        //Import the Scanner Class  from java.util package
        //Create an Object of Scanner class with System.in Arguement
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type your name:- ");
        //For taking a line of input
        String name = sc.nextLine();
        System.out.println("Your name is:- " + name);
        //Some other Popular methods for the scanner class are as below:
        System.out.print("Enter your age:- ");
        int age = sc.nextInt();
        System.out.println("Your age is:- " + age);
        //Close the Scanner object
        sc.close();
    }
}
