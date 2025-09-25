import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int temp = 0;

        int[] baskets = new int[N];
        for (int i = 0; i < N; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;

            while (a < b) {
                temp = baskets[a];
                baskets[a] = baskets[b];
                baskets[b] = temp;
                a++;
                b--;
            }
        }

        sc.close();

        for (int basket : baskets) {
            System.out.print(basket + " ");
        }


    }
}