package com.hasini.app.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int type;
        System.out.println("--------------DNA pairwise sequence alignment----------------");
        System.out.println();
        do {
            Driver drive = new Driver();
            drive.procedure();
            type=0;
            System.out.println();
            System.out.println("Do you want to repeat this again!!");
            try {
                System.out.print("Enter 1 if yes otherwise press ant key to exit : ");
                type = scan.nextInt();
                System.out.println();
            } catch (InputMismatchException ignored) {
            }
        }while (type == 1);
    }

}
