package exercise;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        int num;
        double length;
        double width;
        double Area;
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        length = input.nextDouble();
        //num = input.nextInt();
        //input.close();
        System.out.println("What is the width of the rectangle?");
        width = input.nextDouble();
        //input.close();
        Area = length * width;
        System.out.println("The area of the rectangle is:" + Area);

    }
}

