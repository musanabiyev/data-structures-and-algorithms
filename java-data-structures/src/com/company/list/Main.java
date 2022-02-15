package com.company.list;

import com.company.list.arraylist.MyArrayList;

public class Main {
    public static void main(String[] args) {
//        arraylist
        int n = 20;
        MyArrayList<String> list = new MyArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add("abc#" + i);
        }


        System.out.println("size:" + list.getSize());
        System.out.println("capacity:" + list.getCapacity());

        for (int i = 0; i < list.getSize(); i++) {
            System.out.println("element:" + list.get(i));
        }

    }
}
