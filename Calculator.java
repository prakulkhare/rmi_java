import java.rmi.server.*;
public class Calculator extends UnicastRemoteObject implements CalculatorI     //implementation of remote interface
{
    public Calculator() throws Exception //defining constructor AddC 
    {
        super();   //calling the constructor with the help of method super
    } 
    
    public int add(int x , int y)
    {
        return x+y;
    }
    public int sub(int x , int y)
    {
        return x-y;
    }
    public int mul(int x , int y)
    {
        return x*y;
    }
    public float div(int x , int y)
    {
        return x/y;
    }
    public double Exponent(int x , int y)
    {
        return x^y;
    }
    public  double square_root(int x)
    {
        return Math.sqrt(x);
    }
    public int Factorial(int x)
    {
        int fact = 1;
        for(int i=1;i<=x;i++){    
            fact= fact * i;    
        }
        return fact;
    }
    public double logarithm(int x)
    {
        return Math.log(x);
    }
    public double Sine(double x)
    {
        return Math.sin(x);
    }
    public double Cosine(double x)
    {
        return Math.cos(x);
    }
    public double Tangent(double x)
    {
        return Math.tan(x);
    }
}

