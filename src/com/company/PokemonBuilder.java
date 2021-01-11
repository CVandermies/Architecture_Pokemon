package com.company;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Scanner;

abstract class PokemonBuilder {

    public static ConcretePokemon createPokemon() throws Exception {
        Scanner myObj = new Scanner(System.in);
        String pokemonName;
        String pokemonType1 = "";
        String pokemonType2 = "";
        int pokemonHp = 0;
        int pokemonAtk = 0;
        int pokemonDef = 0;
        int pokemonSpd = 0;

        System.out.println("Enter Pokemon Name");
        pokemonName = myObj.nextLine();
        for (int i = 0 ; i < Pokedex.pokedex.size() ; i++) {
            if (Pokedex.pokedex.get(i).containsValue(pokemonName)) {
                System.out.println("OK");
//                Object[] toArray = Pokedex.pokedex.get(i).values().toArray();
                pokemonType1 = Pokedex.pokedex.get(i).values().toArray()[1].toString();
                pokemonType2 = Pokedex.pokedex.get(i).values().toArray()[2].toString();
                pokemonHp = Integer.parseInt(Pokedex.pokedex.get(i).values().toArray()[3].toString());
                pokemonAtk = Integer.parseInt(Pokedex.pokedex.get(i).values().toArray()[4].toString());
                pokemonDef = Integer.parseInt(Pokedex.pokedex.get(i).values().toArray()[5].toString());
                pokemonSpd = Integer.parseInt(Pokedex.pokedex.get(i).values().toArray()[6].toString());
//                System.out.println(pokemonType1 + pokemonType2 + pokemonHp + pokemonAtk + pokemonDef + pokemonSpd);
            }
        }

//        System.out.println("Enter Pokemon Type");
//        System.out.println("Here are all the types :\nNormal, Fight, Flying, Poison, Ground, Rock, Bug, Ghost, Fire, Water, Grass, Electric, Psychic, Ice, Dragon");
//        pokemonType1 = myObj.nextLine();
//        System.out.println("Enter Pokemon HP (Health Points)");
//        pokemonHp = myObj.nextInt();
//        System.out.println("Enter Pokemon Attack");
//        pokemonAtk = myObj.nextInt();
//        System.out.println("Enter Pokemon Defense");
//        pokemonDef = myObj.nextInt();
//        System.out.println("Enter Pokemon Speed");
//        pokemonSpd = myObj.nextInt();

        return new ConcretePokemon(pokemonName, new ConcreteType(pokemonType1), new ConcreteType(pokemonType2), new Stats(pokemonHp, pokemonAtk, pokemonDef, pokemonSpd));
    }
}
