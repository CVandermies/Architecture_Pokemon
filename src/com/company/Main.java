package com.company;

import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);

        while (true) {
            out.println("\nWelcome to the Pokemon Arena !");
            out.println("\nPlease, choose 2 Pokemons and make them fight");
            out.println("\nWrite\n\"1\" to start\nor\n\"2\" to check all Pokemons \nand then press \"Enter\" to confirm your choice");
            int press =2;
            press = myObj.nextInt();
            if (press == 1) {
                out.println("\nPokemon #1");
                ConcretePokemon pokemon1 = ConcretePokemon.createPokemon();
                out.println("\nPokemon #2");
                ConcretePokemon pokemon2 = ConcretePokemon.createPokemon();

                out.println("\nPokemon #1 => name : " + pokemon1.name + ", type: " + pokemon1.type.name + ", hp: " + pokemon1.hp + ", atk: " + pokemon1.atk + ", def: " + pokemon1.def + ", spd: " + pokemon1.spd);
                out.println("Pokemon #2 => name: " + pokemon2.name + ", type: " + pokemon2.type.name + ", hp: " + pokemon2.hp + ", atk: " + pokemon2.atk + ", def: " + pokemon2.def + ", spd: " + pokemon2.spd);

                out.println("\nFight !");
                out.println("\nThe winner is : " + Fight.winner(pokemon1, pokemon2) + "\n");
            }
            else if (press == 2) {
                Pokedex.pokedex();
                out.println("\nHere all the " + Pokedex.pokedex.size() + " Pokemons :");
                Pokedex.list();
            }
        }
    }
}
