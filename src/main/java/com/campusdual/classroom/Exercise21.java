package com.campusdual.classroom;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise21 {

    protected static String[] data = new String[]{
//            "KPRBC",
//            "YPBTM",
//            "AADXU",
//            "RXCGJ",
//            "WYMVD",
//            "WFGEJ",
//            "TYGBS",
//            "MAPTK",
//            "GJXVE",
//            "BAFGL"
        "ELEMENT KPRBC",
        "ELEMENT YPBTM",
        "ELEMENT AADXU",
        "ELEMENT RXCGJ",
        "ELEMENT WYMVD",
        "ELEMENT WFGEJ",
        "ELEMENT TYGBS",
        "ELEMENT MAPTK",
        "ELEMENT GJXVE",
        "ELEMENT BAFGL"
    };

    public static Set<String> createHashSet() {
        return new HashSet<String>(Arrays.asList(data));

//      _______  PASO A PASO   __________________
//
//        Set<String> hashSet = new HashSet<String>();
//
//        // Poblar el conjunto
//        for (int i = 0; i < data.length; i++) {
//            hashSet.add(data[i]);
//        }
//
//        return hashSet;
    }

    public static Set<String> createTreeSet() {
        return new TreeSet<String>(Arrays.asList(data));

//      _______  PASO A PASO   __________________
//
//       Set<String> treeSet = new TreeSet<String>();
//
//       // Poblar el conjunto
//       for (int i = 0; i < data.length; i++) {
//           treeSet.add(data[i]);
//       }
//
//       return treeSet;
    }

    private static void printSet(Set<String> customSet) {
        for (String s: customSet){
            System.out.println(s);
        }
    }


    public static boolean addElementToSet(Set<String> set, String elementToAdd) {
        // Devuelve el valor booleano de confirmación
        return set.add(elementToAdd);
    }

    public static void main(String[] args) {
        // Objetivo 1
        Set<String> h = createHashSet();
        Set<String> t = createTreeSet();

        // Objetivo 2
        System.out.println("Element added to Hash Set?:" + addElementToSet(h, "ELEMENT AAA"));
        System.out.println("Element added to Tree Set?:" + addElementToSet(t, "ELEMENT AAA"));

        // Objeyivo 3
        System.out.println("HASH SET: ");
        printSet(h);
        System.out.println("========================");
        System.out.println("TREE SET: ");
        printSet(t);
    }

}
