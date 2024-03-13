import java.util.*;
public class VolumeOfSphere
{
    public static double volume(double r)
    {
        final double pi=3.14;
        double sphere=(4.0/3)*(pi)*(r*r*r);
        return sphere;
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius of the Sphere : ");
        double radius=sc.nextDouble();
        System.out.println("The Volume of the Sphere is : ");
        System.out.println(volume(radius));
    }
}