import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] numArr = new int[9][9];
        int max = 0;
        int maxX = 1, maxY = 1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                numArr[i][j] = sc.nextInt();

                if(max < numArr[i][j]){
                    max = numArr[i][j];
                    maxX = i + 1;
                    maxY = j + 1;
                }
            }
        }

        sc.close();

        System.out.println(max);
        System.out.println(maxX + " " + maxY);

    }
}