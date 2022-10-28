import java.util.Scanner;

public class Nested_ifelse {

    public static void main(String[] args){
        int n1, n2, n3;
        System.out.print("Enter nums:");
        Scanner obj=new Scanner(System.in);
        n1=obj.nextInt();
        n2=obj.nextInt();
        n3=obj.nextInt();

        if(n1 > n2){
            if(n1 > n3){
                System.out.print("n1 bigger");
            } else{
                System.out.print("n1 smaller than n3");
            }
        } else{
            if( n2 > n3){
                System.out.print("n2 is bigger");
            } else{
                System.out.print("n2 is smaller");
            }
        }
    }
}
