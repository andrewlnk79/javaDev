package Lesson1;

public class Factorial {
    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        }
        else {
            return f * getFactorial(f - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(0));
    }
}
