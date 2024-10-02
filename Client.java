import java.rmi.*;
import java.util.*;
public class Client
{
    public static void main(String[] args) throws Exception
    {
        CalculatorI obj = (CalculatorI)Naming.lookup("Operations");
        // we will ask rmi registry to give me the object it will any object with caption Add it will give
        //we don't want object of class we want object of interface so here we do typecasting
        Scanner sc = new Scanner(System.in);
        int choice =10;
        
        while(choice != 0){
            System.out.println("Choose the operation:\n1 Addition\n2 Subtracton\n3 Multiplication\n4 Division\n5 Exponent\n6 Square Root\n7 Factorial\n8 Logarithm\n9 Trigonometric\n0 Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                {   System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter a Number: ");
                    int b = sc.nextInt();
                    System.out.println("Addition of two numbers is: "+obj.add(a,b));
                    break;
                }
                case 2:
                {
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter a Number: ");
                    int b = sc.nextInt();
                    System.out.println("Subtraction of two numbers is: "+obj.sub(a,b));
                    break;
                }
                case 3:
                {   
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter a Number: ");
                    int b = sc.nextInt();
                    System.out.println("Multiplication of two number is: "+obj.mul(a,b));
                    break;
                }
                case 4:
                {   
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter a Number: ");
                    int b = sc.nextInt();
                    if(b!=0){
                        System.out.println("Division of two numbers is: "+obj.div(a,b));
                    }
                    else{
                        System.out.println("Error....");
                    }
                    break;
                }
                case 5:
                {   
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Enter a Number: ");
                    int b = sc.nextInt();
                    System.out.println("Exponentiation of two numbers is: "+obj.Exponent(a,b));
                    break;
                }
                case 6:
                {
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Square root of a number is: "+obj.square_root(a));
                    break;
                }
                case 7:
                {
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    if(a == 0){
                        System.out.println("Factorial of 0 : 1");
                    }
                    else{ 
                    System.out.println("Factorial of number is: "+ obj.Factorial(a));
                    break;
                    }
                }
                case 8:
                {
                    System.out.println("Enter a Number: ");
                    int a = sc.nextInt();
                    System.out.println("Log of the given number is: "+obj.logarithm(a));
                    break;
                }
                case 9:
                {
                    System.out.println("Enter a Number: ");
                    double a = sc.nextInt();
                    System.out.println("Sine of the given number is: "+obj.Sine(a));
                    System.out.println("Sine of the given number is: "+obj.Cosine(a));
                    System.out.println("Sine of the given number is: "+obj.Tangent(a));
                    break;
                }
                case 0:
                {
                    System.out.println("Thanks for using our calculator......");
                    break;
                }
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } 
        sc.close();
    }
}
