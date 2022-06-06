import java.util.Scanner;

public class Main {

    private static volatile boolean toyOn;
    private static volatile boolean gameOff;

    public static void main(String[] args) {

        System.out.println("Введите любой символ в консоли и нажмите Enter, чтобы завершить игру");
        new User().start();
        new Toy().start();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            if (scanner.hasNext()) {
                gameOff = true;
                break;
            }
        }

    }

    public static int getRandomDelay(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void setToyOn(boolean toyOn) {
        Main.toyOn = toyOn;
    }

    public static boolean isGameOff() {
        return gameOff;
    }

    public static boolean isToyOn() {
        return toyOn;
    }
}
