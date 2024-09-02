import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();
        float totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            totalMarks += scanner.nextFloat();
        }

        float averageMarks = totalMarks / numSubjects;
        char grade;

        if (averageMarks >= 80) {
            grade = 'A';
        } else if (averageMarks >= 60) {
            grade = 'B';
        } else if (averageMarks >= 40) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks+"%");
        System.out.println("Grade: " + grade);
    }
}
