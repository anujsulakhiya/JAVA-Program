import java.util.*; 

public class random_3digits{

    static int random_3digits(int a,int b,int c){
        int i,j,k,amount=0;
        for(i=a;i<=4;i++){
            for(j=b;j<=4;j++){
                for(k=c;k<=4;k++){
                    if(k!=i && k!=j && i!=j){
                        amount++;
                        System.out.println(i+""+j+""+k);
                    }
                }
            }
        }
        System.out.println("Amount Of All Number is " + amount);
        return 0;
    }    public static void main(String[] args){
            int a,b,c,d;
            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            a=in.nextInt();
            System.out.println("Enter Second Number :");
            b=in.nextInt();
            System.out.println("Enter Third Number :");
            c=in.nextInt();
            
            
            random_3digits(a,b,c);
            
    }
}