public class Main {

    private static volatile boolean toyOn;

    public static void main(String[] args) {
        new User().start();
        new Toy().start();


    }

    public static int getRandomDelay(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static boolean getToyOn() {
        return toyOn;
    }

    public static void setToyOn(boolean toyOn) {
        Main.toyOn = toyOn;
    }
}
