package DetermineIfOrdered_Java;

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int previous = scan.nextInt();
        boolean isOrdered = true;
        boolean asc = true;
        boolean desc = true;
        while (true) {
            int current = scan.nextInt();
            if (current == 0) {
                break;
            }
            if (previous == current) {
                previous = current;
                continue;
            }
            // establish order
            if (previous > current && asc) {
                previous = current;
                desc = false;
                continue;
            }

            if (previous < current && desc) {
                previous = current;
                asc = false;
                continue;
            }

            isOrdered = false;
        }
        System.out.println(isOrdered);
    }
}
