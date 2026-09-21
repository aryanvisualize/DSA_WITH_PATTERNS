import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t--> 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int solvedAllThree = Math.min(a,Math.min(b,c));
            int weak = n -solvedAllThree;
            System.out.println(weak);
        }
        sc.close();
    }
}