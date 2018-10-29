package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int []c = {5,4,2};
        int []d = new int[4];
        int []e = new int[]{3,5,6};
        int [][]f = new int[3][4];
        int [][]g = new int[][]{{1, 2, 3}, {1, 2}, {1}};

        System.out.println(c[2]);
        System.out.println(g[1][0]);
        System.out.println();


        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(60);
        list.add(468);

        for(Integer i : list) {
            System.out.println(i);
        }

        System.out.println();

        Set<String> set = new HashSet<>();
        set.add("Luke Skywalker");
        set.add("Chewbacca");
        set.add("Obi Wan Kenobi");
        set.add("Luke Skywalker");
        set.add("Chewbacca");
        set.add("Luke Skywalker");

        for(String s : set) {
            System.out.println(s);
        }

        System.out.println();

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        for(Integer m : map.keySet()) {
            System.out.println(m);
        }
        System.out.println();

        for(String m : map.values()) {
            System.out.println(m);
        }
        System.out.println();

        for(Integer m : map.keySet()) {
            System.out.println(m + " " + map.get(m));
        }
        System.out.println();

    }
}

