import java.util.Scanner;

public class WithDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInp = "";
        int grade = 0;
        int sum = 0;
        double avg;
        int counter = 0;
        int numStu = 3;

        do {
            System.out.println("Enter a student's grade");
            grade = sc.nextInt();
            sum += grade;
            counter++;
            if (counter >= numStu){
                break;
            }
            System.out.println("Press \"Quit\" to stop or any other key to continue ");
            userInp = sc.next();
        }
        while (!userInp.equalsIgnoreCase("Quit"));

        avg = sum/numStu;
        System.out.println("Average : " + avg);
    }
}
