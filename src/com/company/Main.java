package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String,String>();

        map.put("name", "Yulia");
        map.put("food", "cheese");
        map.put("place", "home");
        System.out.println("map = " + map);

        System.out.println(("My name is " + map.get("name")));
        System.out.println("My favorite food is " + map.get("food"));
        System.out.println("My favorite place is " + map.get("place"));


        String myVal = "home";
        for(String value : map.values()){
            if (myVal==value){
                System.out.println("The value you're testing is in the hashmap");
            } else {

            }
            System.out.println("Value = " + value);
        }
    }

}
