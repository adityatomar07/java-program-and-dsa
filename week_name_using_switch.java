package DSA.conditional_statement;

import java.util.Scanner;

public class week_name_using_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choise = 1;
        while (choise == 1) {
            System.out.println("Enter the week num(1-7) : ");
            int week = sc.nextInt();
            switch (week) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("tuesday");
                    break;
                case 3:
                    System.out.println("wednesday");
                    break;
                case 4:
                    System.out.println("thursday");
                    break;
                case 5:
                    System.out.println("friday");
                    break;
                case 6:
                    System.out.println("saturday");
                    break;
                case 7:
                    System.out.println("sunday");
                    break;

                default:
                    System.out.println(" invalid number!");
                    break;

            }
            System.out.println("Again? (1 = YES, 0 = NO) : ");
            choise = sc.nextInt();

        }
        System.out.println("you chosse the end!");
    }
}
