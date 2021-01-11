package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("\nWelcome to the Pokemon Arena !");
            System.out.println("\nPlease, choose 2 Pokemons and make them fight");

            Pokedex.pokedex();

            Scanner myObj = new Scanner(System.in);

            while (true) {
                System.out.println("\nWrite\n\"1\" to start\nor\n\"2\" to check all Pokemons \nand then press \"Enter\" to confirm your choice");

                int press =2;
                press = myObj.nextInt();

                if (press == 1) {
                    System.out.println("\nPokemon #1");
                    ConcretePokemon pokemon1 = ConcretePokemon.createPokemon();
                    System.out.println("\nPokemon #2");
                    ConcretePokemon pokemon2 = ConcretePokemon.createPokemon();

                    System.out.println("\nPokemon #1 => name: " + pokemon1.name + ", type 1: " + pokemon1.type1.name + ", type 2: " + pokemon1.type2.name + ", hp: " + pokemon1.hp + ", atk: " + pokemon1.atk + ", def: " + pokemon1.def + ", spd: " + pokemon1.spd);
                    System.out.println("Pokemon #2 => name: " + pokemon2.name + ", type 1: " + pokemon2.type1.name + ", type 2: " + pokemon2.type2.name + ", hp: " + pokemon2.hp + ", atk: " + pokemon2.atk + ", def: " + pokemon2.def + ", spd: " + pokemon2.spd);

                    System.out.println("\nFight !");
                    System.out.println("\nThe winner is : " + Fight.winner(pokemon1, pokemon2) + "\n");
                }
                else if (press == 2) {
                    System.out.println("\nHere are all the " + Pokedex.pokedex.size() + " Pokemons :");
                    for (int i = 0; i < Pokedex.pokedex.size() ; i++) {
                        System.out.println(Pokedex.pokedex.get(i));
                    }
                }
                else {
                    System.out.println("\nYou did not enter '1' or '2', please retry\n");
                }
            }
        }
        catch (Exception e) {
            System.out.println("\nYou did not enter '1' or '2', please restart");
        }
    }

}
