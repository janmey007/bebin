import java.util.Scanner;

public class watermelon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if ((a % 2 == 0)&&((a/2)>1)) {
            System.out.println("yes");

        }
        else System.out.println("no");



    }
}
