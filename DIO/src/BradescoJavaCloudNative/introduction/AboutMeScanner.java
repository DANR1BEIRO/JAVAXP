package BradescoJavaCloudNative.introduction;

import java.util.Scanner;

public class AboutMeScanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your first name: ");
        String name = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your height: ");
        double height = input.nextDouble();

        System.out.println("Hello! my name is " + name + " " + lastName);
        System.out.println("I'm " + age + " years old");
        System.out.println("My height is " + height + "m");
        
        input.close();
    }

}
