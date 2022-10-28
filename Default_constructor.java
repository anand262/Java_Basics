class Setval{
    int a; String b ;boolean c;
    Setval(){
       a=10; b = "Anand";c = true;
    }
    void Disp(){
        System.out.println(a+" "+b+" "+c);
    }
}
public class Default_constructor {
  public static void main(String[] args)  {
      Setval r =new Setval();
        r.Disp();
    }

}
