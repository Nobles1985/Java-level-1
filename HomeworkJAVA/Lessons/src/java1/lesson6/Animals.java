package java1.lesson6;

public class Animals {
    private String name;
    private int enduranceRun;
    private int enduranceSwim;
    private static int count;
    public Animals(String name, int endRun, int endSwim){
        this.name = name;
        this.enduranceRun = endRun;
        this.enduranceSwim = endSwim;
        count++;
    }

    public static void main(String[] args){
        Cats cat1 = new Cats("Мурзик", Cats.getEnduranceRunCat(), Cats.getEnduranceSwimCat());
        System.out.println(count + " Имя: " + cat1);
    }
}
