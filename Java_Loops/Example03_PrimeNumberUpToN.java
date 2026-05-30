package Java_Loops;

public class Example03_PrimeNumberUpToN {
    
    public static boolean isPrime(int n){
        for(int i = 2; i <= (int) Math.sqrt(n); i++){
            if( n % i == 0)
                //If n is perfectly divisible by i, it means it has factors, so retrun false
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        
        int n = 100;
        for(int i = 2; i <= n; i++){
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }
}
