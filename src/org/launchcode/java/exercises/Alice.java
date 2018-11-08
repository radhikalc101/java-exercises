package org.launchcode.java.exercises;
import java.util.Scanner;


public class Alice {
    public static void main (String[] args){
//        System.out.println("Hello,Radhika");
        Scanner scan = new Scanner(System.in);
//        int i = scan.nextInt();
//        System.out.println("width:"+i);
//        int j = scan.nextInt();
//        System.out.println("length"+j);
//        int A = i * j;
//        System.out.println("area of a rectangel = "+A);
//        int m = scan.nextInt();
//        System.out.println("miles: "+m);
//        int g = scan.nextInt();
//        System.out.println("gallons: "+g);
//        int mpg = m / g;
//        System.out.println("miles per gallons: "+mpg);
        String text = "Alice was beginning to get very tired of sitting by her sister " +
                "on the bank, and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' " +
                "thought Alice 'without pictures or conversation?'";
        System.out.println("Enter search word :");
        String search = scan.next();
        System.out.println(text.toLowerCase().contains(search)?"Found":"Not Found");


    }
}
