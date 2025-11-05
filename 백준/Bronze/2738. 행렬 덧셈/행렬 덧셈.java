import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr1 = generateArr(sc, n, m);
        int[][] arr2 = generateArr(sc, n, m);

        int[][] sumArr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sumArr[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    public static int[][] generateArr(Scanner sc,int n, int m) {
        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }
}