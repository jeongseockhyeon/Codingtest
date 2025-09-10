import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] nums = new int[N];
        int max;
        int min;

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            if(max < num) max = num;
            if(min > num) min = num;
        }

        System.out.print(min + " " + max);
    }
}