import java.io.*;
public class Main {
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;
        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) return -1;
            }
            return buffer[ptr++];
        }

        long nextLong() throws IOException {
            int c;
            do {
                c = read();
            } while (c <= ' ');
            long x = 0;
            while (c > ' ') {
                x = x * 10 + c - '0';
                c = read();
            }
            return x;
        }
        int nextInt() throws IOException {
            return (int) nextLong();
        }
    }
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();
        StringBuilder out = new StringBuilder();
        int testCases = fs.nextInt();
        while (testCases-- > 0) {
            int n = fs.nextInt();
            long first = fs.nextLong();
            long last = first;
            for (int i = 1; i < n; i++) {
                last = fs.nextLong();
            }
            out.append(gcd(first, last)).append('\n');
        }
        System.out.print(out);
    }
}