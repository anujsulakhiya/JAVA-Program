import java.util.*; 

public class multiply{

    static int multiply(int a,int b){
        return a*b;
    }    public static void main(String[] args){
            int a,b;
            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            a=in.nextInt();
            System.out.println("Enter Second Number :");
            b=in.nextInt();


            int x=multiply(a,b);
            System.out.println(x);
    }
}