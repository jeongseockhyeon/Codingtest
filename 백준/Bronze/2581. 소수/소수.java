import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0;
        int idx = 0;
        int min = 0;
        for (int i = m; i <= n; i++) {
            boolean isPrime = true;

            if(i == 1) continue;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
                idx++;
                if(idx == 1) min = i;
            }
        }
        if(sum == 0){
            System.out.println(-1);
        } else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
