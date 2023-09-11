// Looping through collections with iterators and for-each

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ordered data");
        List<String> list = new ArrayList<>(); // Corrected the ArrayList declaration

        list.add("Tharushi");
        list.add("Chethana");
        list.add("Sanduni");
        list.add("Menaka");

        System.out.println("toString() output");
        System.out.println(list);
        System.out.println("");

        System.out.println("ArrayList iterator");
        Iterator<String> iterator = list.iterator(); // Corrected the iterator variable name
        while (iterator.hasNext()) {
            String value = iterator.next();
            System.out.println(value);
        }
        System.out.println("");

        System.out.println("ArrayList ForEach");
        for(String value: list){
            System.out.println(value);
        }
    }
}
