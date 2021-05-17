import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int firstNo,secNo,addition;
Scanner sc=new Scanner(System.in);
System.out.println("Enter First number:");
firstNo=sc.nextInt();
System.out.println("Enter Second number");
secNo=sc.nextInt();
sc.close();
addition=firstNo+secNo;
System.out.println("Sum:"+addition);
}
}