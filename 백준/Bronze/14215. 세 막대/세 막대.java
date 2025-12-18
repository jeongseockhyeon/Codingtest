import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = 0;

        int a = scanner.nextInt();
        if(max < a) max = a;

        int b = scanner.nextInt();
        if(max < b) max = b;

        int c = scanner.nextInt();
        if(max < c) max = c;

        scanner.close();

        int sum = a + b + c;

        if(sum - max > max) System.out.println(a + b + c);
        else System.out.println((sum - max) * 2 - 1);


    }
}
