
//@author julios campaner
package grade;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER A NUMBER: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is a POSITIVE NUMBER!");
        } else if (number < 0) {
            System.out.println(number + " is a NEGATIVE NUMBER!");
        } else {
            System.out.println("NUMBER INPUT IS ZERO!");
        }

        scanner.close();
    }
}
