import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int quarter = 25;
        int dime = 10;
        int nickel = 5;
        int penny = 1;

        int[] changes = {quarter, dime, nickel, penny};

        for (int i = 0; i < t; i++) {
            int c = Integer.parseInt(br.readLine());
            int[] result = new int[4];
            for (int j = 0; j < changes.length; j++) {
                result[j] = c / changes[j];
                c %= changes[j];
            }
            for (int output : result){
                System.out.print(output + " ");
            }
            System.out.println();
        }

        br.close();
    }
}