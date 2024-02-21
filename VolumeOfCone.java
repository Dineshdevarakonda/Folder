import java.util.*;
public class VolumeOfCone
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Height : ");
        double h=sc.nextDouble();
        System.out.println("Enter the Radius : ");
        double r=sc.nextDouble();
        double v=3.14*r*r*(h/3);
        System.out.println(v);
    }
}