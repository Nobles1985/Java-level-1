package java1.lessons2;

public class HomeWork {

    public static void main(String[] args) {
        System.out.println(sum(7, 4) + "\n");
        number(12);
        System.out.println(numb(-9) + "\n");
        text(4,"Урок 2. Основные конструкции");
        int year = 2022;
        System.out.println("\n" + year + " год является високосным: " + years(year));
    }
    public static boolean sum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
    public static void number(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " положительное.\n");
        } else {
            System.out.println("Число " + a + " отрицательное.\n");
        }
    }
    public static boolean numb(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }
    public static void text(int b, String n) {
        for (int i = 0; i < b; i++) {
            System.out.println(n);
        }
    }
    public static boolean years(int a) {
        if (a % 400 == 0) {
            return true;
        } else if (a % 100 == 0) {
            return false;
        } else if (a % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
