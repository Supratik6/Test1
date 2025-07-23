public class New extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running...");
    }

    public static void main(String args[]) {
        New t1 = new New();
        New t2 = new New();

        // Set custom thread names (optional but useful)
        t1.setName("MyThread-1");
        t2.setName("MyThread-2");

        // Start threads
        t1.start();
        t2.start();

        // Print thread IDs
        System.out.println("id : " + t1.getId());
        System.out.println("id : " + t2.getId());

        // Print thread names
        System.out.println("name: " + t1.getName());
        System.out.println("name: " + t2.getName());
    }
}
