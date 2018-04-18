package com.tw;
import java.util.Scanner;

public class Library {

    public static Scanner sc = new Scanner(System.in);
    private static final String EXIT = "3";

    public static void main(String[] args) {
        try {
            CommandDesktop commandDesktop = new CommandDesktop();
            String input = "-1";
            do {
                System.out.println(commandDesktop.getDesktopMenu());
                input = sc.nextLine();
                System.out.println(input);
            }
            while (!input.equals(EXIT));
        } catch (Exception e) {
            System.out.println("\n App Exist");
        } finally {
            sc.close();
        }
    }
}





