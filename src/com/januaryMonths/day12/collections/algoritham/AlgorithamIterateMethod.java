package com.januaryMonths.day12.collections.algoritham;

import java.util.ArrayList;
import java.util.Iterator;

public class AlgorithamIterateMethod {
    public static void main(String[] args) {
        ArrayList<String> rose = new ArrayList<>();
        rose.add("Rose");
        rose.add("Sunflower");
        rose.add("Lotus");
        rose.add("Lily");
        rose.add("Jasmin");
        rose.add("Lavender");
        rose.add("champak");
        rose.add("Marigold");

        Iterator<String> it = rose.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
