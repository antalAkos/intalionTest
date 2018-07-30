package example;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class Math {
  @WebMethod
  public float add(int a, int b) {

    return a + b;
  }

  @WebMethod
  public float substract(int a, int b) {
    return a - b;
  }

  @WebMethod
  public float multiply(int a, int b) {
    return a * b;
  }

  @WebMethod
  public float divide(int a, int b) throws ArithmeticException {
    if(a != 0 && b != 0) {
      return a / b;
    } else {
      throw new ArithmeticException("ArithmeticException: You cannot divide by 0!");
    }
  }

  public static void main(String[] args) {
    Endpoint.publish("http://localhost:9000/Math", new Math());
  }

/*  public static void main(String[] argv) {
    Object implementor = new Math();
    String address = "http://localhost:9000/Math";
    Endpoint.publish(address, implementor);
  }*/
}
