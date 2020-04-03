import java.util.*; 

public class compare_2_num{

    static int compare_2_num(int a,int b){

        if(a==b)
        System.out.printf("%d == %d\n",a,b);
        if(a != b)
        System.out.printf("%d != %d \n",a,b);
        if(a < b)
        System.out.printf("%d < %d \n",a,b);
        if(a > b)
        System.out.printf("%d > %d \n",a,b);
        if(a <= b)
        System.out.printf("%d <= %d \n",a,b);
    return 0;
        
    }    public static void main(String[] args){
            int a,b;
            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            a=in.nextInt();
            System.out.println("Enter Second Number :");
            b=in.nextInt();

            compare_2_num(a, b);
    }
}