class MyThread extends Thread {

    // don't override run() method

}

public class threading {

    public static void main(String[] args) {

        System.out.println("main has started.");

        MyThread thread1 = new MyThread();

        thread1.start();

        System.out.println("main has ended.");

    }

}