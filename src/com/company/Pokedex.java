package com.company;

import java.io.*;
import java.util.*;

public class Pokedex {
    static String path = ".\\.\\docs\\pokedex.txt";

    static ArrayList<HashMap> pokedex = new ArrayList<>();

    static ArrayList<HashMap> pokedex() throws Exception {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null) {
            HashMap<String, String> characteristics = new HashMap();
            String[] words = st.split(" ");
                characteristics.put("name", words[0]);
                characteristics.put("type1", words[1]);
                characteristics.put("type2", words[2]);
                characteristics.put("hp", words[3]);
                characteristics.put("att", words[4]);
                characteristics.put("def", words[5]);
                characteristics.put("speed", words[6]);
                pokedex.add(characteristics);
        }
        return pokedex;
    }

    static void list() {
        for (int i = 0; i < pokedex.size() ; i++) {
            System.out.println(pokedex.get(i));
        }
    }

}