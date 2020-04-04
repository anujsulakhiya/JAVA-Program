import java.util.*; 

public class letter_counter{

    static int letter_counter(String x) {
        char[] ch = x.toCharArray();
        int letter=0; int number=0; int  space=0; int other=0;
        for (int i = 0; i < x.length(); i++) {
            if (Character.isLetter(ch[i])) {
                letter ++ ;
            } else if (Character.isDigit(ch[i])) {
                number++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;
            } else {
                other++;
            }
            
        }
            System.out.println("letter: " + letter);
            System.out.println("space: " + space);
            System.out.println("number: " + number);
            System.out.println("other: " + other);
        return 0;
    }

    public static void main(final String[] args) {
        String string= "Anuj Sulalkhiya...!!!!";
        letter_counter(string);
        
        }
}