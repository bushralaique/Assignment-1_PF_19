import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
 Scanner sc=new Scanner(System.in);
 double area,s;
 System.out.println("ENTER THE LENGTH OF FIRST SIDE");
 double a=sc.nextDouble();
 System.out.println("ENTER THE LENGTH OF SECOND SIDE");
 double b=sc.nextDouble();
 System.out.println("ENTER THE LENGTH OF THIRD SIDE");
 double c=sc.nextDouble();
 if(a<=0 || b<=0 || c<=0)
 {
System.out.println("LENGTH CANNOT BE NEGATIVE OR ZERO");
 }
 else if (a + b <= c || a + c <= b || b + c <= a)
 {
System.out.println("THE GIVEN SIDES DO NOT FORM A TRIANGLE");
 }
 else
 {
 s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("THE AREA OF TRIANGLE IS\n"+area);
}
}
}