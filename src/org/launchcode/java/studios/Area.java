package org.launchcode.java.studios;
import java.util.Scanner;


public class Area {
    public static void main (String[] args){
        double radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();
        while(radius<0) {
            System.out.println("Please enter the positive number");
            System.out.println("Enter a radius: ");
            radius = in.nextDouble();

        }
        area = (Math.PI * radius * radius);
        System.out.println("The area of a circle of radius " + radius + "is: " + area);

    }
}
