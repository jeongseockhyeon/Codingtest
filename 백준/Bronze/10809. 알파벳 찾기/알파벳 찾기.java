import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int[] array = new int[26];

        for (int i = 0; i < array.length; i++) {
            array[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (array[c - 'a'] == -1) {
                array[c - 'a'] = i;
            }
        }

        for (int num : array) {
            System.out.print(num + " ");
        }


    }
}