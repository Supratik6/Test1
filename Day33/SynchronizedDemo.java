class Table {
    // Synchronized method to prevent multiple threads from printing simultaneously
    synchronized void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n + " x " + i + " = " + (n * i) + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

class MyThread1 extends Thread {
    Table table;
    MyThread1(Table t) {
        this.table = t;
    }

    public void run() {
        table.printTable(5);
    }
}

class MyThread2 extends Thread {
    Table table;
    MyThread2(Table t) {
        this.table = t;
    }

    public void run() {
        table.printTable(10);
    }
}

public class SynchronizedDemo {
    public static void main(String args[]) {
        Table obj = new Table(); // only one object shared

        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}
