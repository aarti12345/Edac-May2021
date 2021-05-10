import java.util.Scanner;
class Division
{
public static void main(String args[])
{
int firstNo,secNo,Division;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number:");
firstNo=sc.nextInt();
System.out.println("Enter Second number");
secNo=sc.nextInt();
sc.close();
Division=firstNo/secNo;
System.out.println("Ans:"+Division);
}
}