import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        br.close();

        ArrayList<Character> characterArrayList = new ArrayList<>();

        while (n > 0) {
            if (n % b < 10) {
                characterArrayList.add((char) (n % b + '0'));
            } else {
                characterArrayList.add((char) (n % b - 10 + 'A'));
            }
            n /= b;
        }
        for (int i = characterArrayList.size() - 1; i >= 0; i--) {
            System.out.print(characterArrayList.get(i));
        }
    }
}
