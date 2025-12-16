import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            int max = 0;
            int a = sc.nextInt();
            if(max < a) max = a;

            int b = sc.nextInt();
            if(max < b) max = b;

            int c = sc.nextInt();
            if(max < c) max = c;


            if(a == 0 && b == 0 && c == 0) break;

            int sum = a + b + c;
            if(max >= (sum - max)){
                System.out.println("Invalid");
                continue;
            }


            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a == b){
                System.out.println("Isosceles");
            } else if (b == c){
                System.out.println("Isosceles");
            } else if (c == a){
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }
    }
}