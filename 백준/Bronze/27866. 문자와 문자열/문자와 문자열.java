import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        int n = sc.nextInt() - 1;

        sc.close();
        System.out.println(S.charAt(n));
    }
}