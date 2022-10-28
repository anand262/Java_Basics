import java.util.Scanner;

public class Condion_ifelseif {

    public static void main(String[] args){
        int marks;
        System.out.print("Marks:");
        Scanner obj=new Scanner(System.in);
        marks=obj.nextInt();

        if( marks>=60 && marks <=100){
            System.out.print("best");
        } else if ( marks>=45 && marks <=60) {
            System.out.print("good");
        } else if (marks>=32 && marks <=45 ) {
            System.out.print("Ok");
        }else {
            System.out.print("Better luck next time");
        }
    }
}
