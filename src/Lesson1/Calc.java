package Lesson1;

import java.util.Scanner;

public class Calc {
    static int num1;
   static int num2;
    static int res;

    public static void main(String[] args) throws MyExeption {
        System.out.println("выберте операцию");
        System.out.println("1. сложение");
        System.out.println("2. вычетание");
        System.out.println("3. умножение");
        System.out.println("4. деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        System.out.println("введите число");
         num1 = scanner.nextInt();
        System.out.println("введите второе число");
         num2 = scanner.nextInt();

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
        System.out.println("результат="+res);
    }
}


