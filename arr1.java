import java.util.Arrays;
import java.util.Scanner;

public class arr1 {
    public static void main(String[] args){
        int a[]=new int[5];
        System.out.print("Enter array off no.");
        Scanner s= new Scanner(System.in);
        for(int i=0; i<5; i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        System.out.print("\n Array elements:");
        for(int b:a){
            System.out.print(b+ " ");
        }

    }

}
