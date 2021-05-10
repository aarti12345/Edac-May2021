import java.util.Scanner;
class Multiplication
{
public static void main(String args[])
{
int firstNo,secNo,Mul;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number:");
firstNo=sc.nextInt();
System.out.println("Enter Second number");
secNo=sc.nextInt();
sc.close();
Mul=firstNo*secNo;
System.out.println("Multiplication is:"+Mul);
}
}