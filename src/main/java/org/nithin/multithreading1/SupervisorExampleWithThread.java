package org.nithin.multithreading1;

public class SupervisorExampleWithThread {

    public static void main(String[] args) {
        ParallelWorker1 p1 = new ParallelWorker1();
        ParallelWorker2 p2 = new ParallelWorker2();

        p1.start();
        p2.start();
    }
}

class ParallelWorker1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Worker 1 is executing : " + i);
        }
    }
}

class ParallelWorker2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Worker 2 is executing : " + i);
        }
    }
}
