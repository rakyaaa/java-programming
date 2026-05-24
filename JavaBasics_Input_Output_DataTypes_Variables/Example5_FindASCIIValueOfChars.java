public class Example5_FindASCIIValueOfChars {
    
    public static void main(String[] args) {
        
        //ASCII Value is the Numberic or integer value representation of the Characters.
        //This is used for the counting the same chars in the String or find the Anagram String

        char first = 'A';
        char second = 'a';
        char third = 'Z';
        char fourth = 'z';
        //We can cast the chars to int to get the ASCII Value of the Characters
        System.out.println((int) first);
        System.out.println((int) second);
        System.out.println((int) third);
        System.out.println((int) fourth);
        //We can use the Addition or Subtraction of the Chars to get the other chars
        //Next char of A
        System.out.println((char)('A' + 1));
        //What is the char from 'a' to next 25th Position
        System.out.println((char) ('a' + 25));
        //What will the ASCII Value of Z - A, used to find anagrams
        //We can create an array of lenght 26 and then put the occurances of each chars on each position
        System.out.println((int) 'Z' - 'A');
        System.out.println((char) 'Z' - 26);
    }
}
