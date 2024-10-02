import java.rmi.Remote;  // creating remote interface
public interface CalculatorI extends Remote
{
    public int add(int x,int y) throws Exception;
    public int sub(int x , int y) throws Exception;
    public int mul(int x , int y) throws Exception;
    public float div(int x , int y) throws Exception; 
    public double Exponent(int x , int y) throws Exception;
    public  double square_root(int x) throws Exception;
    public int Factorial(int x) throws Exception;
    public double logarithm(int x) throws Exception;
    public double Sine(double x) throws Exception;
    public double Cosine(double x) throws Exception;
    public double Tangent(double x) throws Exception;
}
