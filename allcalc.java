import java.nio.IntBuffer;
import java.util.*; 

public class allcalc{
  public static void main(String[] args){
            int a,b;
            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            a=in.nextInt();
            System.out.println("Enter Second Number :");
            b=in.nextInt();

            int sum = a + b;
            int minus = a - b;
            int multiply = a * b;
            int divide = a / b;
            int rnums = a % b;
            
            System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, divide, rnums);
    }
}