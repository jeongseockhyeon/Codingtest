import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] x_arr = new int[n];
        int[] y_arr = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            x_arr[i] = Integer.parseInt(st.nextToken());
            y_arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(x_arr);
        Arrays.sort(y_arr);

        int x_max = x_arr[n - 1];
        int x_min = x_arr[0];

        int y_max = y_arr[n - 1];
        int y_min = y_arr[0];


        int result = (x_max - x_min) * (y_max - y_min);

        System.out.println(result);

    }
}