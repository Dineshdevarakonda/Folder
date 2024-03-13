import java.util.*;
public class VolumeOfCylinder
{
    public static double volume(double r,double h )
    {
        final double pi=3.14;
        double cylinder_volume=pi*(r*r)*h;
        return cylinder_volume;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius Of Cylinder : ");
        double radius=sc.nextDouble();
        System.out.println("Enter the Height of the Cylinder : ");
        double height=sc.nextDouble();
        System.out.println("Volume of Cylinder is : ");
        System.out.println(volume(radius,height));
    }
}