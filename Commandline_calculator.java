import java.util.*;
public class Commandline_calculator {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        float f1=sc.nextFloat();
        float f2=sc.nextFloat();
        System.out.println("Enter the operation you want to perform: \n 1.Addition(+)  2.Subtraction(-)  3.Multiplication(*)\n 4.Division(/)  5.Modulo(%)");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Addition of "+f1+" and "+f2+" is: "+(f1+f2));
            break;
            case 2:
            System.out.println("Subtraction of "+f1+" and "+f2+" is: "+(f1-f2));
            break;
            case 3:
            System.out.println("Multiplication of "+f1+" and "+f2+" is: "+(f1*f2));
            break;
            case 4:
            System.out.println("Division of "+f2+" and "+f2+" is: "+(f1/2));
            break;
            case 5:
            System.out.println("Modulo of "+f1+" and "+f2+" is: "+(f1%f2));
            break;

        }

    }
    
    
}
