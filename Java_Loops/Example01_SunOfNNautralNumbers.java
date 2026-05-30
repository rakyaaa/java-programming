package Java_Loops;

public class Example01_SunOfNNautralNumbers {
 
    public static void main(String[] args) {
        
        int n = 100;
        int m = 100;
        int sum = 0;
        while(n >= 0){
            sum += n;
            n--;
        }
        System.out.println("Sum of first 100 numbers is: "+ sum);
        //Better was is to use the formula i.e n(n+1)/2
        System.out.println("Sum of first 100 numbers using formula is: "+ ((m*(m+1))/2));
    }
}
