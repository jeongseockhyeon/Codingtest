import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        int duration = sc.nextInt();

        int time = hour*60 + min + duration;

        hour = time / 60;
        min = time % 60;

        if(hour >= 24){
            hour = hour - 24;
        }

        System.out.printf("%d %d", hour, min);
    }


}