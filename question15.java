import java.util.Scanner;
class question15
{
public static void main(String args[])
{
int c;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number a :");
int a=sc.nextInt();
System.out.println("enter second number b :");
int b=sc.nextInt();
System.out.println("before swapping:"+ "a" + " = "+ a + " " + "b" + " = " + b);
c=a;
a=b;
b=c;
System.out.println("After swapping:"+ "a" + " = " + a + " " + "b" + " = " + b);
}
}
