package exercise.utils;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

    public static void main(String[] args) {
        LinkedHashMap hashMap = new LinkedHashMap(5,0.75f,true);


        hashMap.put("a", "dfdf");
        hashMap.put("b", "dfdf");
        hashMap.put("a", "dfdf");


        hashMap.get("b");
        hashMap.get("a");


    }

}
