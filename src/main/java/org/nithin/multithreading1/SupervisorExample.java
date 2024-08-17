package org.nithin.multithreading1;

public class SupervisorExample {

    public static void main(String[] args) {
        Worker1 w1 = new Worker1();
        Worker2 w2 = new Worker2();

        try {
            w1.executeWork();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        w2.executeWork();
    }
}

class Worker1 {
    public void executeWork() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            System.out.println("Worker 1 is executing : " + i);
        }
    }
}

class Worker2 {

    public void executeWork(){

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Worker 2 is executing: " + i);
        }
    }

}
