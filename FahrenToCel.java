import java.util.*;
public class FahrenToCel
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Temperature in Fahrenheit : ");
        double f=sc.nextDouble();
        double cel=(f-32)*(1/1.8);
        System.out.println(cel);
    }
}