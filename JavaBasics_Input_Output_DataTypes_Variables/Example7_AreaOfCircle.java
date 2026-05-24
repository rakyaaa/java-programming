public class Example7_AreaOfCircle {
    
    public static void main(String[] args) {
        int radius = 10;
        //We can use the PI constant provided by Math Class in Java
        double areaOfCircle = Math.PI * radius * radius ;
        System.out.printf("Area of circle is:- %.2f",areaOfCircle);
    }
}
