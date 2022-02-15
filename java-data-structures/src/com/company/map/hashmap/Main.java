package com.company.map.hashmap;

public class Main {

    public static void main(String[] args) {

        MyHashMap<String, Integer> map = new MyHashMap();

        int n = 12;
        for (int i = 1; i <= n; i++) {
            map.put("abc#" + i, i);
        }

        System.out.println("size:" + map.getSize());
        System.out.println("capacity:" + map.getCapacity());
        for (int i = 1; i <= n; i++) {
            Integer val = map.get("abc#" + i);
            System.out.println("value:" + val);
        }
    }

}
