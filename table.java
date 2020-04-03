import java.util.*; 

public class table{
  public static void main(String[] args){
            int a,b,i;
            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            a=in.nextInt();
            
            for(i=1;i<=10;i++){
                b=a*i;
                System.out.println(b);            
            }
    }
}