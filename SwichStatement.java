import java.util.Scanner;

public class SwichStatement {

    public static void main(String[] args){
        int a,b,c,ch;
        System.out.print("enter nums:");

        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.print("enter choise:");
        ch=s.nextInt();

        switch (ch){
            case 1: c=a+b;
                System.out.print("add"+ c);
                break;
            case 2: c=a-b;
                System.out.print("sub"+ c);
                break;
            case 3: c=a*b;
                System.out.print("mul"+ c);
                break;
            case 4: c=a/b;
                System.out.print("div"+ c);
                break;
            case 5: c=a%b;
                System.out.print("remider"+ c);
                break;
            default:  System.out.print("no");
        }
    }
}
