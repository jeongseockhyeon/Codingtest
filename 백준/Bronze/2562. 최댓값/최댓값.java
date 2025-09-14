import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int maxIndex = 0;
        int[] nums = new int[9];

        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();

            if(max < nums[i]){
                max = nums[i];
                maxIndex = i + 1;
            }

        }
        sc.close();


        System.out.println(max);
        System.out.println(maxIndex);
    }
}