import java.util.Arrays;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args){
        arrayOne();
        arrayTwo();
        arrayThree();
        arrayFour();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int len = scanner.nextInt();
        System.out.println("Введите содержимое массива (целое число): ");
        int initialValue = scanner.nextInt();
        System.out.println(Arrays.toString(arrayFive(len, initialValue)));
        arraySix();
        int[] array = {2, 1, 4, 5, 3, 4, 5, 1};
        System.out.println("Равна ли сумма левой и правой части массива: " + arraySeven(array));
        System.out.println("Введите целое число, для сдвига массива: ");
        int n = scanner.nextInt();
        arrayEight(array, n);
    }
    public static void arrayOne(){
        int[] arr = {1, 0, 1, 1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void arrayTwo(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void arrayThree(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void arrayFour(){
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (i == j || i + j == arr.length - 1){
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int[] arrayFive(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
    public static void arraySix(){
        int[] arr = {2, 23, 16, 6, -9, 34, 1, 5, 12, 7, 59, -12};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (min > arr[i]) {
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное число в массиве: " + min +"\nМаксимальное число в массиве: " + max);
    }
    public static boolean arraySeven(int[] arr){
        int sum1;
        int sum2;
        int n = 1;
        do{
            sum1 = 0;
            sum2 = 0;
            n = n + 1;
            for (int i = 0; i < arr.length - n; i++){
                sum1 = sum1 + arr[i];
            }
            for (int i = arr.length - n; i < arr.length; i++){
                sum2 = sum2 + arr[i];
            }
        } while (sum1 != sum2 && arr.length - n > 1);
        if (sum1 == sum2){
            return true;
        } else {
            return false;
        }
    }
    public static void arrayEight(int[] arr, int n){
        int swift = n % arr.length;
        int buffer;
        if (swift > 0){
            for(int i = 0; i < swift; i++){
                buffer = arr[arr.length - 1];
                for(int j = arr.length - 1; j > 0; j--){
                    arr[j] = arr[j -1];
                }
                arr[0] = buffer;
            }
        } else if (swift < 0){
            for(int i = 0; i > swift; i--){
                buffer = arr[0];
                for(int j = 0; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = buffer;
            }
        }
        System.out.println("Результат сдвига массива: " + Arrays.toString(arr));
    }
}
