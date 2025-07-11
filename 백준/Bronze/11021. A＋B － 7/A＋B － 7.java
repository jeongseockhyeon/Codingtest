import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            sb.append("Case #" + i + ": " 
                    + (Integer.parseInt(st.nextToken()) 
                    + Integer.parseInt(st.nextToken()))+"\n");
        }
        br.close();
        System.out.println(sb);
    }
}
