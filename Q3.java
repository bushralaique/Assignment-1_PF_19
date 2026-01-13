import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    double dsp=0;//dsp=discountsellingprice
    double da=0;//da=discountamount
    System.out.println("ENTER THE ORIGINAL SELLING PRICE");
    double ogprice=sc.nextDouble();
    System.out.println("ENTER THE DISCOUNT PERCENTAGE");
    double dp=sc.nextDouble();
    if(ogprice<=0)
    {
    System.out.println("THE ORIGINAL PRICE CANNOT BE NEG OR ZERO");    
    }
    if(dp<0)
    {
       System.out.println("THE DISCOUNT PERCENTAGE CANNOT BE NEG");
    }
    else
    {
     da=ogprice*(dp/100);
     dsp=ogprice-da;
     System.out.println("THE DISCOUNTED SELLING PRICE ARE\n"+dsp);
    }
    }
}
 