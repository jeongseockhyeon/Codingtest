import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalX = sc.nextInt();
        int N = sc.nextInt();
        int sum = 0;

        int[][] objArr = new int[N][2];

        for(int i = 0; i < N; i++){
            objArr[i][0] = sc.nextInt();
            objArr[i][1] = sc.nextInt();

            sum += objArr[i][0] * objArr[i][1];
        }
         if(totalX == sum){
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }

    }
}