package com.company;

import java.util.Scanner;

abstract class PokemonBuilder {

    public static ConcretePokemon createPokemon(){
        Scanner myObj = new Scanner(System.in);
        String pokemonName;
        int pokemonHp;
        int pokemonAtk;
        int pokemonDef;
        int pokemonSpd;

        System.out.println("Enter Pokemon Name");
        pokemonName = myObj.nextLine();

        System.out.println("Enter Pokemon HP (Health Points)");
        pokemonHp = myObj.nextInt();
        System.out.println("Enter Pokemon Attack");
        pokemonAtk = myObj.nextInt();
        System.out.println("Enter Pokemon Defense");
        pokemonDef = myObj.nextInt();
        System.out.println("Enter Pokemon Speed");
        pokemonSpd = myObj.nextInt();

        ConcretePokemon newPokemon = new ConcretePokemon(pokemonName, new Stats(pokemonHp, pokemonAtk, pokemonDef, pokemonSpd));
        return newPokemon;
    }
}
