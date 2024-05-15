package ch18.sec03_02;

public class SyncTest2 {
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
        System.out.println("method1() 메서드");

        System.out.println("실행 스레드 : " + Thread.currentThread().getName());
        System.out.println("thread1 : " + t1.getState());
        System.out.println("thread2 : " + t2.getState());
        System.out.println("thread3 : " + t3.getState());
        System.out.println();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    
    public synchronized void method2() {
        System.out.println("method2() 메서드");
        
        System.out.println("실행 스레드 : " + Thread.currentThread().getName());
        System.out.println("thread1 : " + t1.getState());
        System.out.println("thread2 : " + t2.getState());
        System.out.println("thread3 : " + t3.getState());
        System.out.println();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    
    public synchronized void method3() {
        System.out.println("method3() 메서드");

        System.out.println("실행 스레드 : " + Thread.currentThread().getName());
        System.out.println("thread1 : " + t1.getState());
        System.out.println("thread2 : " + t2.getState());
        System.out.println("thread3 : " + t3.getState());
        System.out.println();
        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }

    public static void main(String[] args) {
        SyncTest2 st = new SyncTest2();
        st.startAll();

        // NEW : 스레드가 생성되고 start() 메서드가 호출되기 전 상태
        // RUNNABLE : 실행 전 준비 상태
        // RUNNING : 실행 중인 상태
        // TERMINATED : 종료 상태
        // WAITING : 다른 스레드의 통지(notify, interrupt)를 기다린다.
        // TIMED_WAITING : 주어진 시간 동안 대기
        // BLOCKED : 락이 풀릴 때 까지 대기
    }
}
