package Week2.Week_2;

import java.util.Scanner;

public class Week2TutQues4 {
    public static void main(String[] args) {

        String zodiaclist[] = {"monkey" ,"roaster", "dog", "pig" , "rat" , "ox" , "tiger" , "rabbit" , "dragon" , "snake" , "hourse" , "sheep"};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year : ");
        int year = input.nextInt();
        int zodiacyear = year % 12;
        System.out.print(zodiaclist[zodiacyear]);
        input.close();
    }
}
