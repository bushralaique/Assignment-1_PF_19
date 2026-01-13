import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    double ogprice=0;//ogprice=originalsellingprice
    double da=0;//da=discountamount
    System.out.println("ENTER THE DISCOUNTED SELLING PRICE");
    double dsp=sc.nextDouble();
    System.out.println("ENTER THE DISCOUNT PERCENTAGE");
    double dp=sc.nextDouble();
    if(dsp<=0)
    {
    System.out.println("THE DISCOUNTED SELLING PRICE CANNOT BE NEG OR ZERO");    
    }
    if(dp<0)
    {
       System.out.println("THE DISCOUNT PERCENTAGE CANNOT BE NEG");
    }
    else
    {
     ogprice=dsp/(1-(dp/100));
     System.out.println("THE DISCOUNTED SELLING PRICE ARE\n"+ogprice);
    }
    }
}
 