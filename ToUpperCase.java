import java.util.*;
public class ToUpperCase
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.next();
        System.out.println("Conversion to Upper Case : ");
        System.out.println(s.toUpperCase());
    }
}