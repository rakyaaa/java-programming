public class Example10_BitwiseOperatot {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 5;
        int c = 5;
        int d = 10;
        int e = 11;
        int f = -12;
        //Bitwise AND Operator. Convert the Signed Integer to Binary and then do the operation
        // a = 1010 and b= 0101 so, a and b = 0000, so convert back to sin=gned integer, i.e 0
        System.out.println("a Bitwise AND b:- " + (a&b));
        //a = 00001010 
        //for negative number, first do 12. i.e 1100, not invert all bits, 11110011, then add 1, 11110100
        //now 00001010 and 11110100 = 00000000 = 0
        System.out.println("a Bitwise AND f:- " + (a&f));
        //The negative or ~ operrator is done using the following method. 
        //~10 is -(n+1) i.e -11
        //~-12 = -(-12+1) = 11
        System.out.println("Negataton of a is:- " + (~a));
        System.out.println("Negataton of a is:- " + (~c));
        System.out.println("Negataton of a is:- " + (~f));
        //Bitwise OR operator works just do the OR operations on the Binary
        System.out.println("d Bitwise OR e:- " + (d|e));
        System.out.println("a Bitwise OR f:- " + (a|f));
        //Bitwise XOR: If both bits same then O, else 1
        //So if both numbers are same, then it becomes 0,
        //Best application is to find out which number is not repeated, if the Array has other element 2 times
        System.out.println("a Bitwise XOR f:- " + (a^a));
        System.out.println("a Bitwise XOR f:- " + (a^b));
        System.out.println("a Bitwise XOR f:- " + (a^b^c^d^e));
        //Bitwise Right Shift << , Shift the bits to right, i,e 101 becomes 1010 if we do 1 bits
        //This also becomes multiplication by 2
        System.out.println("Bitwise 1 << of b:- " + (b<<1));
        //We can do it multiple bits as well, as below
        System.out.println("Bitwise 2 << of b:- " + (b<<2));
        System.out.println("Bitwise 3 << of b:- " + (b<<3));
        //Bitwise Left shift >> does the shifting of the bits to the left side
        //This also becomes division by 2
        System.out.println("Bitwise 1 >> of a:- " + (a>>1));
        System.out.println("Bitwise 2 >> of a:- " + (a>>2));
        System.out.println("Bitwise 3 >> of a:- " + (a>>3));
        
    }
}
