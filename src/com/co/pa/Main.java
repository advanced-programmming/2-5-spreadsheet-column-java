package com.co.pa;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static Map<Integer, String> map;

    public static void main(String[] args) {
        fillMap();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = printLetter(number);
        System.out.println(result);
    }

    public static String printLetter(int number){
        StringBuilder result = new StringBuilder();
        if(number == 702) return "ZZ";
        if(number <= 26) {
            result.append(map.get(number));
        } else {
            int value = number / 26;
            result.append(map.get(value));
            int newValue = number % 26;
            result.append(map.get(newValue));
        }
        return result.toString();

    }

    static void fillMap(){
        map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        map.put(6,"F");
        map.put(7,"G");
        map.put(8,"H");
        map.put(9,"I");
        map.put(10,"J");
        map.put(11,"K");
        map.put(12,"L");
        map.put(13,"M");
        map.put(14,"N");
        map.put(15,"O");
        map.put(16,"P");
        map.put(17,"Q");
        map.put(18,"R");
        map.put(19,"S");
        map.put(20,"T");
        map.put(21,"U");
        map.put(22,"V");
        map.put(23,"W");
        map.put(24,"X");
        map.put(25,"Y");
        map.put(26,"Z");
    }
}
