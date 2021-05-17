import static java.lang.Math.*;
import java.util.Scanner;
class question11
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Radius:");
float r=sc.nextFloat();
double Area=PI*r*r;
double Perimeter=2*PI*r;
System.out.println("Area is:" + Area);
System.out.println("Perimeter is:" + Perimeter);
}
}