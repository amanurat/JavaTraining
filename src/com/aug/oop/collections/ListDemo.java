package com.aug.oop.collections;

import java.util.*;

/**
 * Created by amanurat on 11/14/14 AD.
 */
public class ListDemo {

    public static void main(String[] args) {

        System.out.println("### List Demo ###");
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");

        for (String s : list) {
            System.out.println(s);
        }



        System.out.println("### Set Demo ###");
        Set<String> sets = new HashSet<String>();
        sets.add("a");
        sets.add("b");
        sets.add("a");
        sets.add("b");

        for (String s : sets) {
            System.out.println(s);
        }


        Map<String, String> map = new HashMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");

//        String aValue = map.get("a");
//        System.out.println("aValue is : " + aValue);
//        System.out.println("bValue is : " + map.get("b"));

        for (Map.Entry value : map.entrySet()) {
            System.out.println("value of " + value.getKey() + " is "+ value.getValue());
        }






    }

}
