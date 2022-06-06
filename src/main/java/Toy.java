public class Toy extends Thread {

    private static int minDelay = 500;
    private static int maxDelay = 5000;

    @Override
    public void run() {
        while (true) {
            if(Main.getToyOn()) {
                Main.setToyOn(false);
                System.out.println("Игрушка выключила тумблер");
                try {
                    Thread.sleep(Main.getRandomDelay(minDelay, maxDelay));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
