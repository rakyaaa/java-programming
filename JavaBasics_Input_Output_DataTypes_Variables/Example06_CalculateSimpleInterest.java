public class Example06_CalculateSimpleInterest {
    
    public static void main(String[] args) {
        
        int principalAmout = 1000;
        float rate = 22.2f;
        double time = 1.4;
        double simpleInterest = (principalAmout * rate * time) / 100;
        //%.2f is used to display 2 decimal only
        System.out.printf("Final Simple Interest is: %.2f", simpleInterest);
    }
}
