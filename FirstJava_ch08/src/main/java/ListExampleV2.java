package main.java;

import java.util.List;

public class ListExampleV2 {
    private static final String EARTH = "지구";
    private static final String SATURN = "토성";

    public static void main(String[] args) {
        List<String> planets = ListExampleV1.preparePlaneList();
        System.out.println(planets);

        // contain()
        boolean hasEarth = planets.contains(EARTH);
        System.out.println("지구는 존재하는가? " + hasEarth);

        // indexOf()
        int earthIndex = planets.indexOf(EARTH);
        int saturnIndex = planets.indexOf(SATURN);
        System.out.println("지구의 인덱스 : " + earthIndex);
        System.out.println("토성의 인덱스 : " + saturnIndex);

        // listIndexOf()
        planets.add(EARTH);
        int lastEarthIndex = planets.lastIndexOf(EARTH);
        System.out.println("지구의 마지막 인덱스? " + lastEarthIndex);

        // set()
        planets.set(earthIndex, "지구(Earth)");
        System.out.println(planets);
    }
}
