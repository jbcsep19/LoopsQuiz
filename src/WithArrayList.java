/*
Write a program where a teacher is trying to enter a grade
for her 20 students. Write a program that will prompt the teacher to
enter in the grade. Calculate the average.
Display the average to the user. Allow the user to quit at any time
to enter any number of exam scores and the resulting program
will print out the grade, A, B, C, D or F.

taken from https://github.com/bavatar/GradeAvgRep
*/

import java.util.ArrayList;
import java.util.Scanner;

public class WithArrayList {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int grade_no = 0;
        String continueProc = "Y";
        double gradeAvg = 0;
        int gradeSum = 0;
        boolean finished = false;
        int numStu = 20;
        int loopCnt = 0;
        int[] grades = new int[numStu];

        // ArrayList
        ArrayList<Integer> gradeArrayLst = new ArrayList<Integer>();
        //gradeArray.add(3);
        while (true) {
            System.out.print("Enter the students' grade from 0 to 100:");
            grade_no = keyboard.nextInt();
            keyboard.nextLine();

            if (grade_no > 100 || grade_no < 0) {
                // Input Error
                System.out.print("Invalid number grade entered ");
                break;
            }
            gradeArrayLst.add(grade_no);

            System.out.println("Press (q) to quit or any other key to continue");
            continueProc = keyboard.nextLine();
            if (continueProc.endsWith("q")) {
                break;
            }
        }

        // Calculate the average
        for (int grade : gradeArrayLst) {
            gradeSum += grade;
        }
        gradeAvg = gradeSum / gradeArrayLst.size();
        System.out.println("The average for: " + gradeArrayLst.size() + " students is: " + gradeAvg);

    }
}
