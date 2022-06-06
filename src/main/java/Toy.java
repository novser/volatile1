public class Toy extends Thread {

    @Override
    public void run() {
        while (true) {
            if (Main.isGameOff()) {
                break;
            } else if (Main.isToyOn()) {
                Main.setToyOn(false);
                System.out.println("Игрушка выключила тумблер");
            }
        }
    }
}
