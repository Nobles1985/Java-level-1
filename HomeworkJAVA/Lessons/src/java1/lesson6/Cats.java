package java1.lesson6;

public class Cats extends Animals{
    private static int enduranceRunCat = 200;
    private static int enduranceSwimCat = 0;
    private static int countCat;
    public Cats(String name, int endRun, int endSwim){
        super(name, endRun, endSwim);
        countCat++;
    }
    public static int getEnduranceRunCat(){return enduranceRunCat;}
    public static int getEnduranceSwimCat(){return enduranceSwimCat;}
    public static int getCountCat(){return countCat;}
}
