import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        String[] strArr = new String[t];
        for (int i = 0; i < t; i++) {
            int r = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder();

            for (char c : s.toCharArray()) {
                sb.append(String.valueOf(c).repeat(r));
            }

            strArr[i] = String.valueOf(sb);
        }

        for (String result : strArr) {
            System.out.println(result);
        }
    }
}