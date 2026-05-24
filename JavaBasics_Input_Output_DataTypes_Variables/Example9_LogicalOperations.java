public class Example9_LogicalOperations {
     public static void main(String[] args) {
        
        int a = 10;
        int b = 2;
        System.out.println((a > 10) & (b < 3));  //false and true = false
        System.out.println((a > 10) | (b < 3)); //false or true = true
        System.out.println((a > 10)  ^ (b < 3));  //false XOR true = false, if both true then true, if both false, then true
        System.out.println(!(a > 10));  //!false = true
        //&& ||  is for the short circuit. 
        //Checks first condition, if false then and operator will not execute 2nd condition
        //Checks first condition, if TRUE then or operator will not execute 2nd condition
        System.out.println((a > 10) & (b < 3));  //false and true = false
        System.out.println((a > 10) | (b < 3)); //false or true = true
        System.out.println(a==b);  //false
        System.out.println(a!=b); // true
        //Ternary Operation ? : 
        //If a > b, then Rakesh will be printed or Rahul will be printed
        System.out.println((a>b)?"Rakesh":"Rahul");
     }
}
