package ch12.sec02_03;

public class Earth {
    private static Earth ourEarth = null;
    
    private Earth() { }

    public static Earth getInstance() {
        if (ourEarth == null) {
            ourEarth = new Earth();
        }

        return ourEarth;
    }

    public String earthMessage() {
        return "지구는 둥글다.";
    }
}
