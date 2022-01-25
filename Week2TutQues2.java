package Week2.Week_2;

import java.util.Scanner;

public class Week2TutQues2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        double Mean = (num1 + num2 + num3)/3;

        System.out.println("The average of " + num1 + " " + num2 + " "
         + num3 + " is " + Mean);
        
         input.close();
    }
}
