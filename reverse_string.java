import java.util.*; 

public class reverse_string{

    static int reverse_string(char[] a){
        for(int i=a.length - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
        System.out.print("\n");
        return 0;
    }    public static void main(String[] args){
            Scanner in= new Scanner(System.in);

            System.out.println("Enter First Number :");
            char[] letter=in.nextLine().toCharArray();

            reverse_string(letter);
        
        }
}