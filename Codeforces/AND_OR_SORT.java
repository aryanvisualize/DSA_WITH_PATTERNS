import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s =sc.next();
            // If the string starts with 1,
            // the first character can never be changed.
            // Therefore the final sorted string must be all 1s.
            if (s.charAt(0) == '1') {
                int zeros = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        zeros++;
                    }
                }
                System.out.println(zeros);
                continue;
            }
            // s starts with 0.
            // We try every possible boundary:
            //
            // 000000 | 111111
            //
            // Cost = number of 1s on the left
            //      + number of 0s on the right.
            int totalZeros = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    totalZeros++;
                }
            }
            int onesLeft = 0;
            int zerosRight = totalZeros;

            // Boundary before position 0
            int answer = zerosRight;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zerosRight--;
                } else {
                    onesLeft++;
                }
                // Positions [0 ... i] should be 0
                // Positions [i+1 ... n-1] should be 1
                int operations = onesLeft + zerosRight;

                answer =Math.min(answer, operations);
            }
            System.out.println(answer);
        }

        sc.close();
    }
}