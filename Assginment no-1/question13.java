import java.util.Scanner;
class question13
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter width:");
double w=sc.nextDouble();
System.out.println("enter height:");
double h=sc.nextDouble();
double Area = w*h;
double perimeter = 2*(w+h);
System.out.println("Area=" + Area);
System.out.println("perimeter=" + perimeter);
}
}
