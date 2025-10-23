import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();

        int palindrome = 1;
        int last = word.length() - 1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(last - i)) palindrome = 0;

        }

        System.out.println(palindrome);
    }
}
