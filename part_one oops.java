package oops;

import java.util.Scanner;

public class part_one {
    public static void main(String[] args) {
        /*
         * pen p1 = new pen(); // creating a pen object caleed p1.
         * p1.setColor("blue");
         * System.out.println(p1.color);
         * p1.setTip(5);
         * System.out.println(p1.tip);
         */

        /*
         * Student s1 = new Student();
         * s1.name = "Xyz";
         * System.out.println("Student name : " + s1.name);
         * s1.rollNum = 12345;
         * System.out.println("Roll num : " + s1.rollNum);
         * s1.age = 19;
         * System.out.println("Age : " + s1.age);
         * s1.clcPercentage(68, 56, 57);
         * System.out.println("Percentage : " + s1.percentage);
         */

        // input method :--
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Enter Student name : ");
        s1.name = sc.next();

        System.out.println("Enter Age : ");
        s1.age = sc.nextInt();

        System.out.println("Enter ROllNum : ");
        s1.rollNum = sc.nextInt();

        // teeno subject ka marks input lene ke liye
        System.out.println("Enter the Physics marks : ");
        int physics = sc.nextInt();
        System.out.println("Enter the chemistry marks : ");
        int chemistry = sc.nextInt();
        System.out.println("Enter the maths marks : ");
        int maths = sc.nextInt();
        // cal the clcPercentage method here
        s1.clcPercentage(physics, maths, chemistry);
        s1.displayGrade();

        // student details
        System.out.println("\n--Student Details--");
        System.out.println("Student name : " + s1.name);
        System.out.println("Age : " + s1.age);
        System.out.println("Roll num : " + s1.age);
        System.out.println("Percentage : " + s1.percentage + "%");
        sc.close();

    }
}

/*
 * class pen {
 * String color;
 * int tip;
 * 
 * void setColor(String newColor) {
 * color = newColor;
 * 
 * }
 * 
 * void setTip(int newTip) {
 * tip = newTip;
 * }
 * }
 */

class Student {
    String name;
    int rollNum;
    int age;
    float percentage;

    void clcPercentage(int physics, int maths, int chemistry) {
        percentage = (physics + chemistry + maths) / 3.0f;
    }

    void displayGrade() {
        if (percentage >= 60.0f) {
            System.out.println("Grade : First class ");
        } else {
            System.out.println("Grade : second division ");
        }
    }
}