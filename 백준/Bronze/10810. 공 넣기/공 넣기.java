import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] baskets = new int[N];

        int M = sc.nextInt();

        while(M > 0){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int index = i - 1; index < j; index++) {
                baskets[index] = k;
            }

            M--;
        }

        sc.close();

        for (int basket : baskets){
            System.out.print(basket + " ");
        }
    }
}