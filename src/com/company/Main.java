package com.company;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nWelcome to the Pokemon Arena !");
            System.out.println("Please, create 2 Pokemons and make them fight");
            System.out.println("\nPokemon #1");
            ConcretePokemon pokemon1 = ConcretePokemon.createPokemon();
            System.out.println("\nPokemon #2");
            ConcretePokemon pokemon2 = ConcretePokemon.createPokemon();

            System.out.println("\nPokemon #1 => name : " + pokemon1.name + ", type: " + pokemon1.type.name + ", hp: " + pokemon1.hp + ", atk: " + pokemon1.atk + ", def: " + pokemon1.def + ", spd: " + pokemon1.spd);
            System.out.println("Pokemon #2 => name: " + pokemon2.name + ", type: " + pokemon2.type.name + ", hp: " + pokemon2.hp + ", atk: " + pokemon2.atk + ", def: " + pokemon2.def + ", spd: " + pokemon2.spd);

            System.out.println("\nFight !");
            System.out.println("\nThe winner is : " + Fight.winner(pokemon1, pokemon2) + "\n");
        }
    }
}
