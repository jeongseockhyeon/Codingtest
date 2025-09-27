import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] scores = new int[N];

        double[] newScores = new double[N];
        double newSum = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();

            if (M < scores[i]) {
                M = scores[i];
            }
        }

        for (int i = 0; i < N; i++) {
            newScores[i] = (double)scores[i]/M* 100;
            newSum += newScores[i];
        }

        double newAverage = newSum / N;

        System.out.println(newAverage);
        

    }
}