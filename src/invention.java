import java.util.Scanner;
public class soham {
    public static void main(String[] args) {
        Scanner sc = new Scanner(system.in)


        String a = sc.nextLine();
        int b = a.length();
        String d ="";
        for(int i=0;i<b;i++){
             d = a.substring(i,i+1) + d;
        }
        System.out.println(d);

    }
}

