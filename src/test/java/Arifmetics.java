import org.junit.jupiter.api.Test;

public class Arifmetics {

  @Test
  public void test () {
    int a = 8;
    int b = 2;
    double c = 2.1;
    double d = 2.8;
    int f = 2;
    int i = 100;

    int plus = a + b;
    int minus = a - b;
    int multiplication = a * b;
    int division = a / b;
    int remainderFromDivision = b % a;

    double doublePlus = a + c;
    double doubleMultiplication = a * c;

    boolean booleanTrue = a > b;
    boolean booleanFalse = (a - b) < d;
    boolean booleanEqualsTrue = (b >= f);
    boolean booleanEqualsFalse = (b <= 0);

    int overflow = 1000000*1000000;


    
    System.out.println(plus);
    System.out.println(minus);
    System.out.println(multiplication);
    System.out.println(division);
    System.out.println(remainderFromDivision);
    System.out.println(doublePlus);
    System.out.println(doubleMultiplication);
    System.out.println(booleanTrue);
    System.out.println(booleanFalse);
    System.out.println(booleanEqualsTrue);
    System.out.println(booleanEqualsFalse);
    System.out.println(overflow);
  }
}
