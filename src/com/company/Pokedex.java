package com.company;

import java.io.*;
import java.util.*;

public class Pokedex {
    static String path = ".\\.\\docs\\pokedex.txt";

    static ArrayList<LinkedHashMap> pokedex = new ArrayList<>();
    static List<String> characteristics = new ArrayList<>();
    static ArrayList<LinkedHashMap> pokedex() throws Exception {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        characteristics.addAll(Arrays.asList("name", "type1", "type2", "hp", "att", "def", "speed"));

        while ((st = br.readLine()) != null) {
            LinkedHashMap<String, String> pokemons = new LinkedHashMap();
            String[] words = st.split(" ");
            for (int i = 0 ; i < characteristics.size() ; i++) {
                pokemons.put(characteristics.get(i), words[i]);
            }
            pokedex.add(pokemons);
        }
        return pokedex;
    }

    static void list() {
        for (int i = 0; i < pokedex.size() ; i++) {
            System.out.println(pokedex.get(i));
        }
    }

}