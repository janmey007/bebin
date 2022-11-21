import java.util.Scanner;
public class o9janmey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
        if ((a%4)==0){
            System.out.println(a+"is a leap year ");}
        else if ((a%4)!=0){
            System.out.println(a+"is not a leap yesr");
        }

    }

}
