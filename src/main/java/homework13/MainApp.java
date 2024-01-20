package homework13;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    final static int PART_LENGTH = 25000000;
    static double[] array = new double[100000000];
    static List<Thread> thread = new ArrayList<Thread>();

    public static void main(String[] args) {
        // в один поток
        long time = System.currentTimeMillis();
        singleThread();
        System.out.println("1) На обработку массива из " + array.length + " в один поток ушло : " + (double) (System.currentTimeMillis() - time) / 1000 + " сек.");


        // мультипоток
        time = System.currentTimeMillis();
        for (int i = 0; i < 4; i++) {
            multyThreads(i, i * PART_LENGTH, (i + 1) * PART_LENGTH);
            thread.get(i).start();
        }
        for (int i = 0; i < 4; i++) {
            try {
                thread.get(i).join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("2) На обработку массива из " + array.length + " в " + thread.size() + " потока ушло : " + (double) (System.currentTimeMillis() - time) / 1000 + " сек.");
    }

    public static void singleThread() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
        }
    }

    public static void multyThreads(int itr, int from, int to) {
        long localTime = System.currentTimeMillis();
        Thread t = new Thread(() -> {
            for (int i = from; i < to; i++) {
                array[i] = 1.14 * Math.cos(i) * Math.sin(i * 0.2) * Math.cos(i / 1.2);
            }
            System.out.println("Поток " + Thread.currentThread().getName() + " обработал часть массива с " + from + " по " + to + " элемент за: " + (double) (System.currentTimeMillis() - localTime) / 1000 + " сек.");
        });
        thread.add(t);
    }
}
