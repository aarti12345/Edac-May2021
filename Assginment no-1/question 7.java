import java.util.Scanner;
class ReverseOrder
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int num1=sc.nextInt();
int Rev=0;
while(num1!=0)
{
Rev=Rev*10+num1%10;
num1=num1/10;       
}
System.out.println("Reverse number is:" + Rev);
}
}

