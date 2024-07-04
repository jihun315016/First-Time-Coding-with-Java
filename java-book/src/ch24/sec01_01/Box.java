package ch24.sec01_01;

// Person 클래스를 상속받는 타입만 올 수 있다.
public class Box<T extends Person> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
