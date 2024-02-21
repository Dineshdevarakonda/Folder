import java.util.*;
public class CelToFahren
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature in Celsius : ");
        double temp=sc.nextDouble();
        double fahren=(1.8*temp)+32;
        System.out.println(fahren);
    }
}