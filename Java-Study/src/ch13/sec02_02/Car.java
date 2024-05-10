package ch13.sec02_02;

public interface Car {
    public static final int SAFE_SPEED = 60;

    public abstract void speedUp();
    public abstract void speedDown();
    public abstract void stop();
}
