package com.company;

import java.util.Scanner;

abstract class PokemonBuilder {

    public static ConcretePokemon createPokemon() {
        Scanner myObj = new Scanner(System.in);
        String pokemonName;
        String pokemonType;
        int pokemonHp;
        int pokemonAtk;
        int pokemonDef;
        int pokemonSpd;

        System.out.println("Enter Pokemon Name");
        pokemonName = myObj.nextLine();
        System.out.println("Enter Pokemon Type");
        System.out.println("Here are all the types :\nNormal, Fight, Flying, Poison, Ground, Rock, Bug, Ghost, Fire, Water, Grass, Electric, Psychic, Ice, Dragon");
        pokemonType = myObj.nextLine();
        System.out.println("Enter Pokemon HP (Health Points)");
        pokemonHp = myObj.nextInt();
        System.out.println("Enter Pokemon Attack");
        pokemonAtk = myObj.nextInt();
        System.out.println("Enter Pokemon Defense");
        pokemonDef = myObj.nextInt();
        System.out.println("Enter Pokemon Speed");
        pokemonSpd = myObj.nextInt();

        return new ConcretePokemon(pokemonName, new ConcreteType(pokemonType), new Stats(pokemonHp, pokemonAtk, pokemonDef, pokemonSpd));
    }
}
