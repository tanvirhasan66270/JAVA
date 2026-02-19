package Extra;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int count = 0;
        for (int i = 1; i <= input; i++) {

            if (input % i == 0) {
                count = count + 1;

            }

        }
        if (count == 2) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

    }

}
