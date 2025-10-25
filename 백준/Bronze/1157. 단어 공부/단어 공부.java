import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] alphabets = new int[26];

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                alphabets[str.charAt(i) - 'A']++;
            }

            else {
                alphabets[str.charAt(i) - 'a']++;
            }
        }
        int max = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (alphabets[i] > max) {
                max = alphabets[i];
                result = (char) (i + 65);
            } else if (alphabets[i] == max) {
                result = '?';
            }
        }

        System.out.print(result);
    }
}