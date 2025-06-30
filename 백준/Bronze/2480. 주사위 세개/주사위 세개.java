import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c= sc.nextInt();

        if (a == b &&  b == c) {
            int money = 10000 + a * 1000;
            System.out.println(money);
        } else if ( a == b ){
            int money = 1000 + a * 100;
            System.out.println(money);
        } else if (b == c){
            int money = 1000 + b * 100;
            System.out.println(money);
        } else if (c == a) {
            int money = 1000 + c * 100;
            System.out.println(money);
        } else {
            int big = a;
            if(big < b ){
                big = b;
            }
            if(big < c ){
                big = c;
            }
            int money = big * 100;
            System.out.println(money);
        }
    }
}