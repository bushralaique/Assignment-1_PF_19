import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
    float area=0;
    float circumference=0;
    System.out.println("ENTER THE RADIUS OF CIRCLE");
    float radius=sc.nextFloat();
    if(radius<=0)
    {
        System.out.println("RADIUS CAN'T BE NEG OR ZERO");
    }
    else
    {
        area=(float)(Math.PI*radius*radius);
    System.out.println("THE AREA OF CIRCLE IS\n"+area);
    circumference=(float)(2*Math.PI*radius);
    System.out.println("THE CIRCUMFERENCE OF CIRCLE IS\n"+circumference);
    }
    }
}