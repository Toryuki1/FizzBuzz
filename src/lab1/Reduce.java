package lab1;

// Starting with a number n, if n is even divide it by 2. If n is odd, subtract 1. Repeat.
// Prints how many steps it takes to reach 0 if you start at 100.

public class Reduce {
    public static void main(String[] args) {
        System.out.println(reduce(100));
    }

    public static int reduce(int n) {
        if (n == 0) {
            return 0;
        }
        while (n > 0) {
            if (n % 2 == 0) {
                return 1 + reduce(n / 2);
            }
            else {
                return 1 + reduce(n - 1);
            }
        }
        return n;
    }
}
