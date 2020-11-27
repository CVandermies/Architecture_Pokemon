package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        while (true) {
            System.out.println("\nWelcome to the Pokemon Arena !\nType\n\"1\" to start\n" +
                    "or\n\"2\" to check all Pokemon types\nand then press \"Enter\" to confirm your choice");
            int taper =2;
            taper = myObj.nextInt();
            if (taper == 1) {
                System.out.println("\nPokemon #1");
                ConcretePokemon pokemon1 = ConcretePokemon.createPokemon();
                System.out.println("\nPokemon #2");
                ConcretePokemon pokemon2 = ConcretePokemon.createPokemon();

                System.out.println("\nPokemon #1 => name : " + pokemon1.name + ", type: " + pokemon1.type.name + ", hp: " + pokemon1.hp + ", atk: " + pokemon1.atk + ", def: " + pokemon1.def + ", spd: " + pokemon1.spd);
                System.out.println("Pokemon #2 => name: " + pokemon2.name + ", type: " + pokemon2.type.name + ", hp: " + pokemon2.hp + ", atk: " + pokemon2.atk + ", def: " + pokemon2.def + ", spd: " + pokemon2.spd);

                System.out.println("\nFight !");
                System.out.println("\nThe winner is : " + Fight.winner(pokemon1, pokemon2) + "\n");
             } else if (taper == 2) {
                System.out.print("The different types are : ");
                System.out.println("Normal, Fight, Flying, Poison, Ground, Rock, Bug, Ghost, Fire, Water, Grass, Electric, Psychic, Ice, Dragon");
            }
        }
    }
}
