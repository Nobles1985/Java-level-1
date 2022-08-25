package java1.lessons1;

public class HomeWorkApp {

    public static void main(String[] args){
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple\n");
    }
    public static void checkSumSign(){
        int a = 13;
        int b = 27;
        if (a + b >= 0) {
            System.out.println("Сумма положительная\n");
        } else {
            System.out.println("Сумма отрицательная\n");
        }
    }
    public static void printColor(){
        int value = -8;
        if (value <= 0) {
            System.out.println("Красный\n");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый\n");
        } else {
            System.out.println("Зеленый\n");
        }
    }
    public static void compareNumbers(){
        int a = 25;
        int b = 4;
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
