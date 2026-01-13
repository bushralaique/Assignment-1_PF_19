import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    double k=0;
    System.out.println("ENTER THE LENGTH OF ONE PARALLEL SIDE");
    double a=sc.nextDouble();
    System.out.println("ENTER THE LENGTH OF OTHER PARALLEL SIDE");
    double b=sc.nextDouble();
    System.out.println("ENTER THE PERPENDICULAR DISTANCE BETWEEN THESE TWO PARALLEL LINES");
    double h=sc.nextDouble();
    if(a<=0)
    {
    System.out.println("LENGTH OF PARALLEL SIDE CANNOT BE NEG OR ZERO");
    }
    if(b<=0)
    {
    System.out.println("LENGTH OF PARALLEL SIDE CANNOT BE NEG OR ZERO"); }
    if(h<=0)
    {
    System.out.println("DISTANCE CANNOT BE NEG OR ZERO");    
    }
    else
    {
    k=h*(a+b)/2;
    System.out.println("THE AREA OF TRAPEZOID\n"+k); 
    }
    }
}