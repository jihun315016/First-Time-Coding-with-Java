package ch18.sec03_03;

public class SyncTest3 {
    Thread t1 = new Thread("thread1") {
        public void run() {
            method1();
        }
    };

    Thread t2 = new Thread("thread2") {
        public void run() {
            method2();
        }
    };

    Thread t3 = new Thread("thread3") {
        public void run() {
            method3();
        }
    };

    public synchronized void method1() {
        System.out.println("\nmethod1() 메서드");

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        System.out.println("실행 스레드 : " + Thread.currentThread().getName());
        System.out.println("thread1 : " + t1.getState());
        System.out.println("thread2 : " + t2.getState());
        System.out.println("thread3 : " + t3.getState());
    }

    public synchronized void method2() {
        System.out.println("\nmethod2() 메서드");

        try { Thread.sleep(100); } catch (InterruptedException e) {}

        System.out.println("실행 스레드 : " + Thread.currentThread().getName());
        System.out.println("thread1 : " + t1.getState());
        System.out.println("thread2 : " + t2.getState());
        System.out.println("thread3 : " + t3.getState());
    }

    public synchronized void method3() {
        System.out.println("\nmethod3() 메서드");

        synchronized(this) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
    
            System.out.println("실행 스레드 : " + Thread.currentThread().getName());
            System.out.println("thread1 : " + t1.getState());
            System.out.println("thread2 : " + t2.getState());
            System.out.println("thread3 : " + t3.getState());
        }
    }

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }

    public static void main(String[] args) {
        SyncTest3 st = new SyncTest3();
        st.startAll();

        // NEW : 스레드가 생성되고 start() 메서드가 호출되기 전 상태
        // RUNNABLE : 실행이 가능하거나 실행 중인 상태
        // TERMINATED : 종료 상태
        // WAITING : 다른 스레드의 통지(notify, interrupt)를 기다린다.
        // TIMED_WAITING : 주어진 시간 동안 대기
        // BLOCKED : 락이 풀릴 때 까지 대기
    }
}
