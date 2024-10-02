import java.rmi.*;//importing package because we are using naming class
public class Server //Server side
{
    public static void main(String[] args) throws Exception
    {
        CalculatorI obj = new Calculator(); // Your implementation of AddI
        Naming.rebind("Operations", obj);// rebind is responsible to assign a caption to an object and rebind is staic so we use naming.rebind
        System.out.println("Server Started");
    }
}
