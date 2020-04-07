import java.util.*; 


public class print_odd_no{

    static int print_odd_no(int a){
        for(int i=0;i<=a;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        return 0;
    }    public static void main(String[] args){

            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            int a=in.nextInt();

            print_odd_no(a);
    }
}