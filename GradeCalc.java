import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Enter total number of subjects to calculate the marks
        System.out.println("enter total no of subjects: ");
        int numSubjects = scan.nextInt();

        int totalMarks = 0;

        for(int i=1; i<=numSubjects; i++){
            System.out.println("Enter marks for the Subject:" + i + "(OUT OF 100): ");

            int marks = scan.nextInt();
              //INPUT VALIDATION
            while (marks <0 || marks > 100) {
                System.out.println("Invalid marks. please enter marks etween 0 & 100");
                System.out.println("Enter marks for subject: " + i + "out of 100");
                marks = scan.nextInt();
            }
            totalMarks += marks;
        }
        System.out.println("Student Result: ");
        System.out.println("Total marks obtainedin all subjects: "+ totalMarks);

        //calculate average percentage : Divide the total marks by total number 
        //of subjects to get the average percentage

        int AveragePercentage = totalMarks / numSubjects;
        System.out.println("Average Percentage: "+ AveragePercentage);

        //Grade calculation : assign grades based on the average percentage 

        if (AveragePercentage >= 90) {
            System.out.println("Your grade: A+");
        }
        else if (AveragePercentage >= 80) {
            System.out.println("Your grade: B+");
        }
        else if (AveragePercentage >= 70) {
            System.out.println("Your grade: B+");
        }
        else if (AveragePercentage >= 60) {
            System.out.println("Your grade: C5+");
        }
        else if (AveragePercentage >= 50) {
            System.out.println("Your grade: C");
        }
        else if (AveragePercentage >= 40) {
            System.out.println("Your grade: D+");
        }
        else if (AveragePercentage >= 30) {
            System.out.println("Your grade: D");
        }
        else  {
            System.out.println("Your grade: E");
        }

        scan.close();



    }
}