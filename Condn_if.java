import java.util.Scanner;

public class Condn_if {
    public static void main(String[] args){

        int pwd;
        System.out.print("Enter  nums:");
        Scanner obj = new Scanner(System.in);
        pwd=obj.nextInt();
        if(pwd==1234){
            System.out.print("yes");
            System.out.print("Done!");
        }
    }
}
