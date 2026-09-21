import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        while (testCases-- > 0){
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int numberOfCarrots = Integer.parseInt(tokenizer.nextToken());
            int maxLength = Integer.parseInt(tokenizer.nextToken());
            int[] frequency = new int[maxLength + 1];
            tokenizer = new StringTokenizer(reader.readLine());
            for (int i = 0; i < numberOfCarrots; i++) {
                int length = Integer.parseInt(tokenizer.nextToken());
                frequency[length]++;
            }
            int[] greaterCount = new int[maxLength + 1];
            int remainingCarrots = 0;
            for (int length = maxLength; length >= 1; length--) {
                greaterCount[length] = remainingCarrots;
                remainingCarrots += frequency[length];
            }
            int maximumCarrots = 0;
            for (int targetLength = 1; targetLength <= maxLength; targetLength++) {
                int doubleLength = 2 * targetLength;
                int extraFromDoubleLength = 0;
                if (doubleLength <= maxLength) {
                    extraFromDoubleLength = frequency[doubleLength];
                }
                int currentCarrots =
                        frequency[targetLength]
                                + greaterCount[targetLength]
                                + extraFromDoubleLength;

                maximumCarrots = Math.max(
                        maximumCarrots,
                        currentCarrots
                );
            }
            output.append(maximumCarrots).append('\n');
        }
        System.out.print(output);
    }
}