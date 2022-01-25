package Week2.Week_2;//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.util.Scanner;

public class Week2TutQues1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for radius: ");
        Double radius  = input.nextDouble();
        //From here
        double area = radius * radius * Math.PI; 
        System.out.println("The area of the circle (" + radius + "): " + area);  
        input.close();
    }
}

//OOP style (need to compile)
//Circle circle1 = new Circle();
//circle1.setRadius(radius);
