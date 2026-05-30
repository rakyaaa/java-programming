package Java_Loops;

public class Example02_ReverseAndPalindromeNumber {

    public static int reverseInteger(int number){
        int reverseNumber = 0;
        while(number > 0){
            int digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit; 
            number = number/10;
        }
        return reverseNumber;
    }
    public static void main(String[] args) {
        int number = 1234321;
        
        System.out.printf("Reverse of the given number is %d", reverseInteger(number));
        System.out.println();
        //To check if the number is palindrome or not, we can check using this reverse method.
        System.out.println((number == reverseInteger(number))? "Number is Palidrome" : "Number is not Palindrome");
    }
}
