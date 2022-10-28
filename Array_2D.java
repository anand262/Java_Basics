import java.util.Arrays;
import java.util.Scanner;

public class Array_2D {
        public static void main(String[] args){
            int a[][]=new int[2][2];
            System.out.print("Enter array off no.");
            Scanner s= new Scanner(System.in);
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++) {
                    a[i][j] = s.nextInt();
                }
            }
            //Arrays.sort(a);
            System.out.print("\n Array elements:\n");
            for(int i=0; i<2; i++){
                for(int j=0; j<2; j++) {
                    System.out.print(a[i][j] +" ");
                }
                System.out.println();
            }
        }
}
