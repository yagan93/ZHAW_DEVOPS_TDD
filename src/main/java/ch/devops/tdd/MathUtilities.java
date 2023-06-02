package ch.devops.tdd;

public class MathUtilities {

    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The index cannot be negative.");
        }

        if (n <= 1) {
            return n;
        }

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return b;
    }
}


