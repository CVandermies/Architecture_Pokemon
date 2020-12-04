package com.company;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Pokedex {
    static String path = ".\\.\\docs\\pokedex.txt";

//    static int[][] pokedex = new int[151][9];
    static ArrayList<HashMap> pokemon = new ArrayList<>();

    static void pokedex() throws Exception {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null) {
            HashMap<String, String> poke = new HashMap();
            String[] words = st.split(" ");

//            for (int i = 0; i < words.length; i++) {
                poke.put("name", words[0]);
                poke.put("type1", words[1]);
                poke.put("type2", words[2]);
                poke.put("hp", words[3]);
                poke.put("att", words[4]);
                poke.put("def", words[5]);
                poke.put("speed", words[6]);
//            }
            pokemon.add(poke);
        }
        System.out.println(pokemon);
    }
}

//public class Pokedex {
//    static String path = ".\\.\\docs\\pokedex.txt";
//    File file = new File(path);
//    Scanner in = new Scanner(file);
//    while(in.hasNextLine()) {
//        String currentLine = in.nextLine();
//        String[] words = currentLine.split(" ");
//        for(String a : words){
//            if(a.equals("YourWord")) {
//                // Do something
//            }
//        }
//    }
//}