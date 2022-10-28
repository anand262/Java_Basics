import java.util.Arrays;

public class Scanerjava {
    public static void main(String[] args){
        String  mn ="Anand Shinde";
        int i = mn.length();
        String mmn = new String("Anand Shinde");
       // if(mn==mmn) when we do only == sign then it only see the value where it store and give not equal because both are diffrent variable.
        if(mn.equals(mmn))// In this case .equal see the value in te object.
        {
            System.out.println("equal");
        }else{
            System.out.println("No equal");
        }
    }
}
