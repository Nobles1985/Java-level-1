package java1.lesson7;

public class Cats {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cats(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    //Метод, отвечающий за потребление котом корма.
    public void eat(Plates plate){
        plate.decreaseFood(appetite);
        if (plate.decreaseFood(appetite) == true){
            satiety = true;
        }
    }
    //Метод, информирующий о сытости кота.
    public void info(){
        if(satiety == true){
            System.out.println(name + " наелся и не хочет есть.");
        } else {
            System.out.println(name + " все еще голоден.");
        }
    }
}
