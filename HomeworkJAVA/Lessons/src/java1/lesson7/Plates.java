package java1.lesson7;

import java.util.Scanner;

public class Plates {
    private int food;
    public Plates(int food){
        this.food = food;
    }
    Scanner sc = new Scanner(System.in);
    //Метод уменьшает колиство корма в тарелке в соответствии с аппетитом кота.
    public boolean decreaseFood(int appetite){
        if(food >= appetite){
            food -= appetite;
            return true;
        } else {
            return false;
        }
    }
    //Метод отображает количество корма в тарелке.
    public void info(){
        System.out.println("В тарелке " + food + " г. корма");
    }
    //Метод позволяет выбрать, добавлять корм в тарелку или нет. И если да, то сколько.
    public void newFood(){
        int choice;
        do {
            System.out.println("Добавить корма в тарелку? 1 - да, 2 - нет.");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 2);
        if (choice == 1) {
            System.out.println("Сколько корма добавить?");
            int foodNew = sc.nextInt();
            food += foodNew;
            info();
        }
    }
}
