package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("\nWelcome to the Pokemon Arena !");
            System.out.println("\nPlease, create 2 Pokemon teams and make them fight");

            //Initialize the Pokedex for choosing and creating Pokemons
            Pokedex.pokedex();

            Scanner myObj = new Scanner(System.in);

            while (true) {
                ArrayList<ConcretePokemon> team1 = new ArrayList<>();
                ArrayList<ConcretePokemon> team2 = new ArrayList<>();

                System.out.println("\nWrite\n\"1\" to start\nor\n\"2\" to check all Pokemons \nand then press \"Enter\" to confirm your choice");

                int press = myObj.nextInt();
                while (press != 1 && press != 2) {
                    System.out.println("\nYou must enter \"1\" or \"2\", please retry");
                    press = myObj.nextInt();
                }

                if (press == 1) {
                    System.out.println("\nHow many Pokemons do you want in Team 1 ? (1-6)");
                    teams(team1);

                    System.out.println("\nHow many Pokemons do you want in Team 2 ? (1-6)");
                    teams(team2);

                    System.out.println("\nTeam 1:");
                    print(team1);

                    System.out.println("\nTeam 2:");
                    print(team2);

                    System.out.println("\nFight !");

                    while (!team1.isEmpty() && !team2.isEmpty()) {
                        System.out.println("\nThe winner is : " + Fight.winner(team1.get(i), team2.get(i)));
                        if (Fight.winner(team1.get(i), team2.get(i)) == team1.get(i).name) {
                            next(team2, team1);
                        }
                        else {
                            next(team1,team2);
                        }
                    }
                    if (!team1.isEmpty() && team2.isEmpty()) {
                        System.out.println("Team 1 has won !\n");
                    }
                    else {
                        System.out.println("Team 2 has won !\n");
                    }
                }
                else if (press == 2) {
                    System.out.println("\nHere are all the " + Pokedex.pokedex.size() + " Pokemons :");
                    for (int i = 0; i < Pokedex.pokedex.size() ; i++) {
                        System.out.println(Pokedex.pokedex.get(i));
                    }
                }
            }
        }
        catch (Exception e) {
            System.out.println("\nYou did not enter a number, please restart");
//            e.printStackTrace();
        }
    }

    static int press = 1;
    static Scanner myObj = new Scanner(System.in);

    public static void teams(ArrayList<ConcretePokemon> team1) throws Exception {
        press = myObj.nextInt();
        while (press != 1 && press != 2 && press != 3 && press != 4 && press != 5 && press != 6) {
            System.out.println("\nYou must enter \"1\", \"2\", \"3\", \"4\", \"5\" or \"6\", please retry");
            press = myObj.nextInt();
        }
        for (int i = 1 ; i <= press ; i++) {
            System.out.println("\nPokemon #" + i);
            team1.add(ConcretePokemon.createPokemon());
        }
    }

    public static void print(ArrayList<ConcretePokemon> team1) {
        for (int i = 0 ; i < team1.size() ; i++) {
            System.out.println("Pokemon #" + (i+1) + " → name: " + team1.get(i).name + ", type 1: " + team1.get(i).type1.name + ", type 2: " + team1.get(i).type2.name + ", hp: " + team1.get(i).hp + ", atk: " + team1.get(i).atk + ", def: " + team1.get(i).def + ", spd: " + team1.get(i).spd);
        }
    }

    static int i;
    public static void next(ArrayList<ConcretePokemon> team2, ArrayList<ConcretePokemon> team1) {
        team2.remove(i);
        if (team2.size() > 1) {
            System.out.println("\nWhich Pokemon do you want to use next ?");
            for (int j = 0 ; j < team2.size() ; j++) {
                System.out.println("\"" + (j+1) + "\"" + " for " + team2.get(j).name);
            }
            press = myObj.nextInt();
            while (press != 1 && press > team2.size()) {
                System.out.println("\nPlease retry");
                press = myObj.nextInt();
            }
            team2.add(0, team2.get(press-1));
            team2.remove(press);
            System.out.println("\nPlayer 2 is sending " + team2.get(0).name);
        }
        substitute(team1);
    }

    public static void substitute(ArrayList<ConcretePokemon> team1) {
        if (team1.size() > 1) {
            System.out.println("Do you want to substitute Pokemons ?");
            System.out.println("\"1\" for \"Yes\"");
            System.out.println("\"2\" for \"No\"");
            press = myObj.nextInt();
            while (press != 1 && press != 2) {
                System.out.println("\nYou must enter \"1\" or \"2\", please retry");
                press = myObj.nextInt();
            }
            if (press == 1) {
                System.out.println("\nWhich Pokemon do you want to use ?");
                for (int j = 0 ; j < team1.size() ; j++) {
                    System.out.println("\"" + (j+1) + "\"" + " for " + team1.get(j).name);
                }
                press = myObj.nextInt();
                while (press != 1 && press > team1.size()) {
                    System.out.println("\nPlease retry");
                    press = myObj.nextInt();
                }
                team1.add(0, team1.get(press-1));
                team1.remove(press);
            }
        }
    }

}
