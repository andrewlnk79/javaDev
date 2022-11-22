package Lesson1;

public class TriangleNum {
    static int triangleF(int n) throws MyExeption {
        if (n<0){
            throw new MyExeption("число должно быть больше 0");
        }

        if (n == 1)
            return 1;
        else
            return (n + triangleF(n - 1));


    }

    public static void main(String[] args) throws MyExeption {
        System.out.println(triangleF(2));
    }
}
