
//@julios campaner

package no2;
import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("PLEASE ENTER A NUMBER: ");
            int number = scanner.nextInt();
            
            
            if (number == 0) {
                
                System.out.println("THE INPUT NUMBER: Zero");
            } else if (number % 2 == 0) {
                
                System.out.println("THE INPUT NUMBER IS EVEN.");
            } else {
                
                System.out.println("THE INPUT NUMBER IS ODD.");
            }
        }
    }
}