package pro.sky.java.course1.finalcheck;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Введите строку: ");

        String str = in.nextLine();
        boolean strIsEmpty = str.isEmpty();
        int mid = str.length() / 2;

        if (!strIsEmpty) {
            String firstPart = str.substring(0, mid);
            String secondPart = str.substring(mid);

            System.out.println(firstPart + " | " + secondPart);
        } else {
            System.out.println("Строка не должна быть пустой!");
        }

    }
}