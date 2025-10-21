import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] piece = {1, 1, 2, 2, 2, 8};

        int[] differences = new int[6];

        for (int i = 0; i < 6; i++) {
            int a = sc.nextInt();
            differences[i] = piece[i] - a;
        }

        for (int difference : differences) {
            System.out.print(difference + " ");
        }
    }
}
