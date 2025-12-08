import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x_arr = new int[3];
        int[] y_arr = new int[3];

        for (int i = 0; i < 3; i++) {
            x_arr[i] = sc.nextInt();
            y_arr[i] = sc.nextInt();
        }
        sc.close();
        int x,y;

        if(x_arr[0] == x_arr[1]) {
            x = x_arr[2];
        } else {
            x = (x_arr[0] == x_arr[2]) ? x_arr[1] : x_arr[0];

        }

        if(y_arr[0] == y_arr[1]) {
            y = y_arr[2];
        } else {
            y = (y_arr[0] == y_arr[2]) ? y_arr[1] : y_arr[0];
        }

        System.out.println(x + " " + y);
    }
}
