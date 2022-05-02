package com.pradum;

import java.util.ArrayList;

public class PhonePadCombination {
    public static void main(String[] args) {

        System.out.println(Alloutcomes1("","12"));
    }
    public static ArrayList<String> Alloutcomes1(String p, String Up)
    {
        if (Up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = Up.charAt(0) - '0'; // this will convert '2' into 2

        ArrayList<String> list = new ArrayList<>();

        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            list.addAll(Alloutcomes1(p + ch, Up.substring(1)));
        }
        return list;
    }
    }
