import java.util.Scanner;
public class Main
{
public static void main(String[]args)
{
    Scanner sc=new Scanner(System.in);
    double w=0;//w=watts 
    System.out.println("ENTER THE VOLTAGE");
    double v=sc.nextDouble();//v=voltage 
    System.out.println("ENTER THE AMPERE");
    double a=sc.nextDouble();//a=ampere
    if(v<0)
    {
    System.out.println("VALUE OF VOLTAGE CANNOT BE NEG");    
    }
    if(a<0)
    {
    System.out.println("VALUE OF AMPERE CANNOT BE NEG");    
    }
    else
    {
    w=v*a;    
    System.out.println("THE WATTS ARE\n"+w);    
    }
}
}