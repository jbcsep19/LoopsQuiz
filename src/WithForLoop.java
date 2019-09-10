
/*
Write a program by hand.

A teacher is trying to enter a grade for her 20 students.
Write a program that will prompt the teacher to enter in the grade.
Calculate the sum of those numbers, and calculate the average.
Display the average to the user.
Allow the user to quit if they type in "quit".
*/
import java.util.Scanner;
public class WithForLoop{
    public static void main(String[]args){
        int grade = 0;
        int sum = 0;
        double avg = 0;
        int numStu = 3;
        String userInp = "";
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        int t=1;
        for(int i = 1; i <= numStu; i++){
            System.out.println("Enter a grade: ");
            grade = sc.nextInt();
            sum += grade;

            sc.nextLine();

            System.out.println("Press \"quit\" to exit or " +
                    "any other key to continue");
            userInp = sc.nextLine();
            if (userInp.equalsIgnoreCase("Quit")){
                quit = true;
                System.out.println("Exiting loop");
                break;
            }
            t = i;
        }
        if (!quit){
            avg = sum/numStu;
            System.out.println("Calculating average of grades... "
            + avg);
        } else {
            avg = sum/t;
//            System.out.println("Not applicable");
            System.out.println("Calculating average of grades... "
                    + avg);
        }

    }
}


