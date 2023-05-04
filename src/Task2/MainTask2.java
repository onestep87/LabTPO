package Task2;

import static java.lang.Thread.sleep;

public class MainTask2 {
    private static final int AMOUNT_OF_ELEMENTS = 5000;
    private static final int SIZE_OF_BUFFER = 3;

    public static void main(String[] args) {
        Drop drop = new Drop(SIZE_OF_BUFFER);

        new Thread(new Producer(drop, AMOUNT_OF_ELEMENTS)).start();
        new Thread(new Consumer(drop)).start();
    }
}