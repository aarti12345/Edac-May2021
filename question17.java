import java.util.Scanner;
class question17
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
{
int num1,num2;
int i=0,carry=0;
int[] arr=new int[10];
System.out.print("enter first binary number:");
num1=sc.nextInt();
System.out.print("enter second binary number:");
num2=sc.nextInt();
while(num1!=0 || num2!=0)
{
arr[i]=(int)((num1%10+num2%10+carry)%2);
i++;
carry=(int)((num1%10+num2%10+carry)%2);
num1=num1/10;
num2=num2/10;
}
if(carry!=0)
{
arr[i]=carry;
i++;
}
System.out.print("sum :");
i--;
while(i!=0)
{
System.out.print(arr[i]);
i++;
}
}
}
}
