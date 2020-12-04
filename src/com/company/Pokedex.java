package com.company;

import java.io.*;

public class Pokedex {
    static String path = ".\\.\\docs\\pokedex.txt";

    static void pokedex() throws Exception {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;

        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }
}
