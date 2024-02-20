package ru.lopatin.homeworks.homework21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static String mon = "5";
    public static String cl = "A";

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            pool.execute(() -> {
                prinA();
            });
            pool.execute(() -> {
                prinB();
            });
            pool.execute(() -> {
                prinC();
            });
        }
        pool.shutdown();

    }

    public static void prinA() {
        synchronized (mon) {
            try {
                while (!cl.equals("A")) {
                    mon.wait();
                }
                System.out.print("A");
                cl ="B";
                mon.notifyAll();
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void prinB() {
        synchronized (mon) {
            try {
                while (!cl.equals("B")) {
                    mon.wait();
                }
                System.out.print("B");
                cl ="C";
                mon.notifyAll();
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void prinC() {
        synchronized (mon) {
            try {
                while (!cl.equals("C")) {
                    mon.wait();
                }
                System.out.print("C");
                cl ="A";
                mon.notifyAll();
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
