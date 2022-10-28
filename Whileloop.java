import java.util.Scanner;

public class Whileloop {

    public static void main(String[] args) {
        int num;
        System.out.print("enter nums:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();

        while(num>=0){
            if(num%2==0){
                System.out.print("even");
                break;
            }else{
                System.out.print("odd");
            }
        }
    }
}
