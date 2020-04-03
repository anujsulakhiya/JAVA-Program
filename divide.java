
public class divide{

    static double divide(double d, double e) {
        if (d / e == 0) {
            System.out.println("Error");
        } else {
            return (double) (d / e);
        }
        return 0;
    }

    public static void main(String[] args) {
        double x = divide(13.0, 3.0);
            System.out.println(x);
        }
}