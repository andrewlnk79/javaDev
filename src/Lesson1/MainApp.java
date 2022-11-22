package Lesson1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i <= n; i++) {
            if (i != n) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.print(n*(n+1)/2);
    }
}
