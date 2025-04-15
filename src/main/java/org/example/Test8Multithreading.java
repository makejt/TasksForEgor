package org.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test8Multithreading {
    /*
    Задача:
        Есть несколько потоков-работников, которые параллельно увеличивают результат на 1.
        Главный поток должен дождаться, пока все они завершат свою работу,
        и затем главный поток использует результат их работы (выводит в консоль).
 */
    private static final int COUNT = 5;

    private static int result = 0;


    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(COUNT);
        CountDownLatch latch = new CountDownLatch(COUNT);

        for (int i = 0; i < COUNT; i++) {
            executor.submit(() -> {
                try {
                    Thread.sleep(500);
                    System.out.println(Thread.currentThread().getName() + " started");
                    Thread.sleep(1000);
                    result++;
                    System.out.println(Thread.currentThread().getName() + " finished");
                    latch.countDown();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            });
        }

        try {
            System.out.println(Thread.currentThread().getName() + " is waiting for others");
            latch.await();
            System.out.println(Thread.currentThread().getName() + " продолжил работу");

            System.out.println(result); // ??????????

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            executor.shutdown();
        }
    }
}
