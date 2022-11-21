import java.util.Scanner;
public class o8janmey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type a 3 digit number u will get its pallindrome");
        int a = sc.nextInt();
        if (a  <= 999){

            int b = a / 100;
            if (a > 900 && a > 800 && a > 700 && a > 600 && a > 500 && a > 400 && a > 300 && a > 200 && a > 100) {
                int c = a - 900;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 800 && a > 700 && a > 600 && a > 500 && a > 400 && a > 300 && a > 200 && a > 100) {
                int c = a - 800;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 700 && a > 600 && a > 500 && a > 400 && a > 300 && a > 200 && a > 100) {
                int c = a - 700;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 600 && a > 500 && a > 400 && a > 300 && a > 200 && a > 100) {
                int c = a - 600;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 500 && a > 400 && a > 300 && a > 200 && a > 100) {
                int c = a - 500;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 400 && a > 300 && a > 200 && a > 100) {
                int c = a - 400;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 300 && a > 200 && a > 100) {
                int c = a - 300;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 200 && a > 100) {
                int c = a - 200;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            } else if (a > 100) {
                int c = a - 100;
                int d = c / 10;
                if (c > 90 && c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 90;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 80 && c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 80;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 70 && c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 70;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 60 && c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 60;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 50 && c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 50;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 40 && c > 30 && c > 20 && c > 10) {
                    int e = c - 40;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 30 && c > 20 && c > 10) {
                    int e = c - 30;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 20 && c > 10) {
                    int e = c - 20;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c > 10) {
                    int e = c - 10;
                    System.out.println((100 * e) + (10 * d) + b);
                } else if (c < 10) {
                    int e = c;
                    System.out.println((100 * e) + (10 * d) + b);
                }


            }

        }
        else if(a>999){
            System.out.println("plz type 3digit number only");
        }
    }

}
