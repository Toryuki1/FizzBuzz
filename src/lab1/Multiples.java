package lab1;

// return the number of integers greater than 0 and less than 1000 that are multiples of 3 or 5.
public class Multiples {

    public static void main(String[] args) {

        System.out.println(multiples(1000, 3, 5));
    }

    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i < n; i++){
            if (i % a == 0 || i % b == 0){
                count += 1;
            }
        }
        return count;
    }

    public static int multiples() {
        return multiples(1000, 3, 5);

    }
}
