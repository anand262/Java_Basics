public class Second {
    int a= 10;  // instance variable
    static double b=20.5; // static variable
    public static void main(String[] args) {
        boolean c=true; // Local variable
// for instance variable we can oprate the value without giving the object we can see as per below
        Second s =new Second(); // object for instance vaiable
        System.out.println(s.a); // instance var
        System.out.println(b);
        System.out.println(c);
    }
}
