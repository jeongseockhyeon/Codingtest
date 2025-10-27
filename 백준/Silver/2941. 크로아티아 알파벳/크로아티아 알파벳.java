import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] list = {"c=","c-","dz=","d-","lj","nj","s=","z="};

        String str = sc.next();

        for (int i = 0; i < list.length; i++) {
            if (str.contains(list[i])) {
                str = str.replace(list[i],"A");
            }
        }
        sc.close();
        System.out.println(str.length());
    }
}
