package java1.lesson6;

import java.util.Scanner;

public class Animals {
    private String name;
    private int enduranceRun;
    private int enduranceSwim;
    private static int distanceRun;
    private static int distanceSwim;
    private static int count;
    public Animals(String name, int endRun, int endSwim){
        this.name = name;
        this.enduranceRun = endRun;
        this.enduranceSwim = endSwim;
        count++;
    }
    public void obstacleRun(int distanceRun){
        int result = enduranceRun - distanceRun;
        if (result >= 0){
            System.out.println(name + " пробежал " + distanceRun + " метров.");
        } else {
            System.out.println(name + " устал и не смог пробежать " + distanceRun + " метров.");
        }
    }
    public void obstacleSwim(int distanceSwim){
        if (enduranceSwim == 0) {
            System.out.println(name + " не умеет плавать!");
        } else {
            int result = enduranceSwim - distanceSwim;
            if (result >= 0){
                System.out.println(name + " проплыл " + distanceSwim + " метров.");
            } else {
                System.out.println(name + " устал и не смог переплыть " + distanceSwim + " метров.");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Dogs dog1 = new Dogs("Шарик", Dogs.getEnduranceRunDog(), Dogs.getEnduranceSwimDog());
        Dogs dog2 = new Dogs("Бобик", Dogs.getEnduranceRunDog(), Dogs.getEnduranceSwimDog());
        Cats cat1 = new Cats("Мурзик", Cats.getEnduranceRunCat(), Cats.getEnduranceSwimCat());
        Cats cat2 = new Cats("Пушок", Cats.getEnduranceRunCat(), Cats.getEnduranceSwimCat());
        System.out.println("Введите длину пути: ");
        distanceRun = sc.nextInt();
        System.out.println("Введите ширину бассейна: ");
        distanceSwim = sc.nextInt();
        cat1.obstacleRun(distanceRun);
        dog2.obstacleRun(distanceRun);
        cat2.obstacleSwim(distanceSwim);
        dog1.obstacleSwim(distanceSwim);
        System.out.println("Всего животных: " + count + ", из них собак: " + Dogs.getCountDog() + " и котов: " + Cats.getCountCat());
    }
}
