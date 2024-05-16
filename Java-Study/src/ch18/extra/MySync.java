package ch18.extra;

class MySync {
    Thread t1 = new Thread("t1") {
        public void run() {
            method1();
        }
    };

    Thread t2 = new Thread("t2") {
        public void run() {
            method2();
        }
    };


    public void method1() {
        synchronized(this) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("\nmethod1() 호출");
            System.out.println("실행 스레드 : " + Thread.currentThread().getName());
            System.out.println("t1 : " + t1.getState());
            System.out.println("t2 : " + t2.getState());
        }
    }

    public void method2() {
        synchronized(this) {
            try { Thread.sleep(1000); } catch (InterruptedException e) {}
            System.out.println("\nmethod2() 호출");
            System.out.println("실행 스레드 : " + Thread.currentThread().getName());
            System.out.println("t1 : " + t1.getState());
            System.out.println("t2 : " + t2.getState());
        }
    }

    void startThread() {
        t1.start();
        t2.start();
    }

    public static void main(String[] args) {
        MySync myThread = new MySync();
        myThread.startThread();
    }
}