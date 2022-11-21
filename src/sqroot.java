import java.util.Scanner;

public class sqroot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("plzź enter values of quadratic");
        System.out.println("a(x)sq+ b(x)+c");
        System.out.println(" plz enter value of a");
        int a = sc.nextInt();
        System.out.println(" plz enter value of b");
        int b = sc.nextInt();
        System.out.println(" plz enter value of c");
        int c = sc.nextInt();
        double j = (b*b)-(4*a*c);
        double p = Math.sqrt(j);
        double g = ((-b)-p)/(2*a);
        double h = ((-b)+p)/(2*a);
        System.out.println("alpha = "+g);
        System.out.println("beta = "+h);




    }
}
