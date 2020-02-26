package main;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        String[] str = new String[a];
        String[] str3 = new String[a];
        int[] str2 = new int[a];
        int b = 0;
        for (int i = 0; i < a; i++) {
            str = scanner.nextLine().split(" ");
            str2[i] = Integer.parseInt(str[0]);
            str3[i] = str[1];
        }
        for (int i = 0; i < str2.length - 1; i++) {
            if (str2[i] > str2[i + 1]) {
                str2[i + 1] = str2[i];
            } else
                b = i + 1;
        }
        System.out.println(str3[b]);
    }
}