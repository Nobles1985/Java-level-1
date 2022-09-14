package java1.lesson7;

public class MainClass {
    public static void main(String[] args){
        Cats[] cat = new Cats[5];
        cat[0] = new Cats("Мурзик", 10);
        cat[1] = new Cats("Пушок", 5);
        cat[2] = new Cats("Черныш", 7);
        cat[3] = new Cats("Васька", 8);
        cat[4] = new Cats("Барон", 12);
        Plates plate = new Plates(0);
        System.out.println("В тарелке нет корма!");
        plate.newFood();
        for(int i = 0; i < cat.length; i++){
            cat[i].eat(plate);
            cat[i].info();
        }
        plate.info();
    }
}