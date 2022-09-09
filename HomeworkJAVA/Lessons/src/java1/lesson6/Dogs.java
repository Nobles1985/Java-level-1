package java1.lesson6;

public class Dogs extends Animals{
    private static int enduranceRunDog = 500;
    private static int enduranceSwimDog = 10;
    private static int countDog;

    public Dogs(String name, int endRun, int endSwim){
        super(name, endRun, endSwim);
        countDog++;
    }
    public static int getEnduranceRunDog() {
        return enduranceRunDog;
    }
    public static int getEnduranceSwimDog() {
        return enduranceSwimDog;
    }
}
