
package grade;

import java.util.Scanner;
//@julios campaner

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER YOUR NAME: ");
        String name = scanner.nextLine();
        
        System.out.print("ENTER YOUR MARK IN SCIENCE: ");
        int science = scanner.nextInt();
        
        System.out.print("ENTER YOUR MARK IN HISTORY: ");
        int history = scanner.nextInt();
        
        System.out.print("ENTER YOUR MARK IN MATH: ");
        int math = scanner.nextInt();
        
        System.out.print("ENTER YOUR MARK IN SOCIAL SCIENCE: ");
        int soc = scanner.nextInt();
        
        System.out.print("ENTER YOUR MARK IN ARTS: ");
        int arts = scanner.nextInt();
        
        int totalMarks = science + history + math + soc + arts;
            double percentage = (totalMarks / 5.0);
        
        String remarks;
        if (percentage < 70) {
            remarks = "YOU FAILED:<";
            
        } else if (percentage >= 71 && percentage <= 75) {
            remarks = "POOR";
            
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "FAIR";
            
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "GOOD";
            
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "VERY GOOD";
            
        } else {
            remarks = "EXCELLENT!";
        }
        
        System.out.println("\nYOUR TOTAL MARK: " + totalMarks);
        System.out.printf("YOUR TOTAL PERCENTAGE: %.2f\n", percentage);
        System.out.println("REMARKS: " + remarks);
        
        if (percentage < 70) {
            System.out.println("PLEASE TRY AGAIN, " + name + "!");
        } else {
            System.out.println("NAKS! CONGRATS " + name + ", YOU PASSED!");
        }

        scanner.close();
    }
}
