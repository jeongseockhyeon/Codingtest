import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String[] strArr = new String[T];
        for (int i = 0; i < T; i++) {
            strArr[i] = sc.next();
        }

        for (String str : strArr) {
            System.out.println(str.charAt(0)+""+str.charAt(str.length()-1));
        }

        sc.close();

    }
}