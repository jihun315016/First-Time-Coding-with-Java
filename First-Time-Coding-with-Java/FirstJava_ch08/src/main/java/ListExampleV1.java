package main.java;

import java.util.ArrayList;
import java.util.List;

class ListExampleV1 {
    public static void main(String[] args) {
        List<String> planets = preparePlaneList();

        // add(index, value)
        planets.add(3, "화성");
        System.out.println("화성 추가 후 : " + planets);

        // addAll()
        List<String> otherPlanets = new ArrayList<>();
        otherPlanets.add("목성");
        otherPlanets.add("토성");
        otherPlanets.add("천황성");
        planets.addAll(otherPlanets);
        System.out.println("행성 추가 후 : " + planets);

        // clear()
        planets.clear();
        System.out.println("clear() 후 : " + planets);

        // isEmpty()
        boolean isEmpty = planets.isEmpty();
        int size = planets.size();
        System.out.println("planets 리스트는 비어있는거? " + isEmpty + " > size? " + size);
    }

    public static List<String> preparePlaneList() {
        List<String> p = new ArrayList<>();
        p.add("수성");
        p.add("금성");
        p.add("지구");        
        return p;
    }
}