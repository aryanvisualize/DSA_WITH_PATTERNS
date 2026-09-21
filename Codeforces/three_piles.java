import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- >0) {
            long a = sc.nextLong();
            long b =sc.nextLong();
            long c =sc.nextLong();
            long option1 =Math.abs(a - b);
            long option2 = Math.abs(a - b +c);
            long answer = Math.max(option1, option2);
            System.out.println(answer);
        }
        sc.close();
    }
}