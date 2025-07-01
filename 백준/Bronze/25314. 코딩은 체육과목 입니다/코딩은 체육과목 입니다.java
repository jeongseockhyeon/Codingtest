import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int n = N / 4;
        String type = "int";


        for (int i = 0; i < n; i++) {
            type = "long " + type;
        }

        System.out.println(type);
    }
}
