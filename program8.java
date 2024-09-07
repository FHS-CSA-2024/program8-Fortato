//import stuff here
import java.lang.Math;
import java.util.Scanner;

//Your code here
public class program8{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);
        //var
        int num1;
        int num2;

        //input
        System.out.print("Enter number 1: ");
        num1 = myObj.nextInt();
        System.out.println("");
        System.out.println("");
        System.out.print("Enter number 2: ");
        num2 = myObj.nextInt();
        System.out.println("");
        System.out.println("");

        //output
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println("");
        System.out.println("Sum is " + (num1 + num2));
        System.out.println("");
        System.out.println("Difference is " + (num1 - num2));
        System.out.println("");
        System.out.println("Product is " + (num1 * num2));
        System.out.println("");
        System.out.println("Average is " + ((num1 + num2) / (2.0)));
        System.out.println("");
        System.out.println("Absolute value is " + Math.abs(num1 - num2));
        System.out.println("");
        System.out.println("Maximum is " + ((num1 > num2) ? (num1) : (num2)));
        System.out.println("");
        System.out.println("Minimum is " + ((num1 < num2) ? (num1) : (num2)));
        System.out.println("");
    }
}
//Paste console output below:
/*

Enter number 1: 13


Enter number 2: 20


Original numbers are 13 and 20

Sum is 33

Difference is -7

Product is 260

Average is 16.5

Absolute value is 7

Maximum is 20

Minimum is 13

*/
