package Lesson1;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) throws MyExeption {
        System.out.println("выберте операцию");
        System.out.println("1. сложение");
        System.out.println("2. вычетание");
        System.out.println("3. умножение");
        System.out.println("4. деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        System.out.println("введите число");
        int num1 = scanner.nextInt();
        System.out.println("введите второе число");
        int num2 = scanner.nextInt();
        int res;
        if (operation == 1) {
            res = num1 + num2;
        } else if (operation == 2) {
            res = num1 - num2;

        } else if (operation == 3) {
            res = num1 * num2;

        } else {
            if (num2 == 0) {
                throw new MyExeption("делить на 0 нельзя");



            }
            res = num1 / num2;


        }
    }
}
