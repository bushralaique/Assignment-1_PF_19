import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    //a=percentage marks
    //b=otained marks
    //c=maximum marks
        float a=0;
        System.out.println("ENTER OBTAINED MARKS");
        float b=sc.nextFloat();
        System.out.println("ENTER MAXIMUM MARKS");
         float c=sc.nextFloat();
         
         
         if(b<0)
         {
             System.out.println("OBTAINED MARKS CANNOT BE NEG");
         }
         if(c<=0)
         {
           System.out.println("MAXIMUM MARKS CANNOT BE NEG OR ZERO");  
         }
         if(b>c)
         {System.out.println("OBTAINED MARKS CANNOT BE GREATER THAN MAXIMUM MARKS");
         }
       else  
         {
         a=(b*100)/c;
         System.out.println(" PERCENTAGE MARKS\n"+a);    
         }
         
    }
}