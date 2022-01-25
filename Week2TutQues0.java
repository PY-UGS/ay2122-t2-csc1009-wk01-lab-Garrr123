package Week2.Week_2;

import java.util.Scanner;

public class Week2TutQues0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a byte value: ");
        byte byteValue  = input.nextByte();

        System.out.println("Enter a short value: ");
        short shortValue  = input.nextShort();

        System.out.println("Enter a integer value: ");
        int intValue  = input.nextInt();

        System.out.println("Enter a long value: ");
        long longValue  = input.nextLong();
        
        System.out.println("Enter a float value: ");
        float floatValue  = input.nextFloat();

        System.out.print("the byte entered is" + byteValue);
        System.out.print("the byte entered is" + shortValue);
        System.out.print("the byte entered is" + intValue);
        System.out.print("the byte entered is" + longValue);
        System.out.print("the byte entered is" + floatValue);

        input.close();
        
    }
}
