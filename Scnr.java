import java.util.Scanner;

public class Scnr {

    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Enter two nums:");
        Scanner s=new Scanner(System.in);

        a = s.nextInt();
        b = s.nextInt();

        c=a+b;
        System.out.println("sums:" + c);

    }
}
