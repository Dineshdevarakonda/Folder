import java.util.*;
public class PerimeterOfRectangle
{
    public static double perimeter(double l,double w)
    {
        return 2*(l+w);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length of the Rectangle : ");
        double length=sc.nextDouble();
        System.out.println("Enter the Width of the Rectangle : ");
        double width=sc.nextDouble();
        System.out.println("Perimeter of the rectangle is : "+perimeter(length,width));
    }
}