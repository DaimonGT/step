package by.bogdanov.L08_12_2025;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {
/*    static int counter = 0;

    public static synchronized void increment(){
        counter++;
    }*/

    static AtomicInteger counter = new AtomicInteger(0);
    static final Object lockA = new Object();
    static final Object lockD = new Object();

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Привет! Я новый поток");
        });
        thread.start();

        // Сделать поток, который считает от 1 до 5
        Thread thread2 = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread2.start();

        // задача 3
        Thread a = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                System.out.println("Работник А");
            }
        });

        Thread b = new Thread(() -> {
            for (int i = 1; i < 6; i++) {
                System.out.println("Работник B");
            }
        });
        a.start();
        a.join();
        b.start();

        // задача 4
        Thread thread4 = new Thread(() -> {
            System.out.println("Я ушел спать");
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                System.out.println("Меня разбудили");
            }
        });
        Thread.sleep(1000);
        thread4.interrupt();
        thread4.start();

        // задача 5
        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) {
                counter.incrementAndGet();
            }
        };
        Thread t5 = new Thread(task);
        Thread t6 = new Thread(task);

        t5.start();
        t6.start();

        t5.join();
        t6.join();
        System.out.println("counter = " + counter);

        // задача 9
        Thread t7 = new Thread(() -> {
            synchronized (lockA) {
                System.out.println("t1 взял А");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockD) {
                    System.out.println("t1 взял D");
                }
            }
        });

        Thread t8 = new Thread(() -> {
            synchronized (lockD) {
                System.out.println("t2 взял D");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lockA) {
                    System.out.println("t2 взял A");
                }
            }
        });
        t7.start();
        t8.start();
    }
}

