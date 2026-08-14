import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step 1: Take number of subjects
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        // Step 2: Initialize total marks
        int total = 0;

        // Step 3: Take marks for each subject
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + " (out of 100): ");
            int marks = sc.nextInt();

            // Add marks to total
            total = total + marks;
        }

        // Step 4: Calculate average percentage
        double average = (double) total / n;

        // Step 5: Calculate grade
        char grade;

        if (average >= 90) {
            grade = 'A';
        } 
        else if (average >= 80) {
            grade = 'B';
        } 
        else if (average >= 70) {
            grade = 'C';
        } 
        else if (average >= 60) {
            grade = 'D';
        } 
        else if (average >= 50) {
            grade = 'E';
        } 
        else {
            grade = 'F';
        }

        // Step 6: Display result
        System.out.println("\n----- STUDENT RESULT -----");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Percentage: " + average + "%");
        System.out.println("Grade: " + grade);

        sc.close();
    }
}