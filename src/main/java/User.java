public class User extends Thread {

    private static int minDelay = 1000;
    private static int maxDelay = 3000;

    @Override
    public void run() {
        while (true) {
            if (Main.isGameOff()) {
                break;
            } else if (!Main.isToyOn()) {
                Main.setToyOn(true);
                System.out.println("Пользователь включил тумблер");
                try {
                    Thread.sleep(Main.getRandomDelay(minDelay, maxDelay));
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
