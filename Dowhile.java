import java.util.Scanner;

public class Dowhile {


    public static void main(String[] args) {
        int num;
        System.out.print("enter nums:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        do{
            System.out.println(num);
            ++num;// we used for increment the number
        }while (num<=100);
    }
}
