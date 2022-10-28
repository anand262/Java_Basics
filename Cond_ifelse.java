import java.util.Scanner;

public class Cond_ifelse {

    public static void main(String[] args){

        int age;
        System.out.print("Enter  nums:");
        Scanner obj = new Scanner(System.in);
        age=obj.nextInt();
        if(age>18){
            System.out.print("yes");
            System.out.print("Done!");
        } else {
            System.out.print("No");
        }
    }
}
