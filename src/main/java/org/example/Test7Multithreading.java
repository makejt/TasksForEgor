package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test7Multithreading {


    private static final int COUNT = 5;

    public static void main(String[] args) {
         /*
        Задача:
        Есть несколько потоков-работников, которые параллельно выполняют какие-то задачи.
        Главный поток должен дождаться, пока все они завершат свою работу, и затем главный поток продолжит выполнение.
     */


            ExecutorService executor = Executors.newFixedThreadPool(COUNT);
            CountDownLatch latch = new CountDownLatch(COUNT);

            List<Runnable> workerThreads = new ArrayList<>();
            for (int i = 0; i < COUNT; i++) {
                workerThreads.add(new Thread(() -> {

                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + " started");
                        Thread.sleep(1000); // Симулируем работу
                        System.out.println(Thread.currentThread().getName() + " finished");

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }));
            }


            System.out.println(Thread.currentThread().getName() + " is waiting for others");

            System.out.println(Thread.currentThread().getName() + " продолжил работу");


        }
}
