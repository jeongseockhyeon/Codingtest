import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        int tempB = b;

        while(tempB > 0){
            System.out.println(a * (tempB % 10));
            tempB /= 10;
        }
        System.out.println(a * b);
    }
}