package Lesson_07;

public class test {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        int sum = ++num1 + num2++ + num3++;
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
        System.out.println("num3= "+num3);

        System.out.println("sum = "+sum);

    }
}
