package lab1;

// return the number of integers greater than 0 and less than 1000 that are multiples of 3 or 5.
public class Multiples {

    public static void main(String[] args) {

        int count = 0;
        for (int i = 1; i < 1000; i++){
            if (i % 3 == 0 || i % 5 == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
