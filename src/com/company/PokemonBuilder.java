package com.company;

import java.util.ArrayList;
import java.util.Scanner;

abstract class PokemonBuilder {

    public static ConcretePokemon createPokemon() throws Exception {
        String pokemonName;
        String pokemonType1 = "";
        String pokemonType2 = "";
        int pokemonHp = 0;
        int pokemonAtk = 0;
        int pokemonDef = 0;
        int pokemonSpd = 0;

        System.out.println("Enter Pokemon Name");
        Scanner myObj = new Scanner(System.in);
        pokemonName = myObj.nextLine();

        // List to check if Pokemon wanted by the user exists
        ArrayList<String> pokemons = new ArrayList<>();
        for (int j = 0 ; j < Pokedex.pokedex.size() ; j++) {
            pokemons.add(Pokedex.pokedex.get(j).values().toArray()[0].toString());
        }

        while (!pokemons.contains(pokemonName)) {
            System.out.println("This Pokemon does not exist, please retry");
            pokemonName = myObj.nextLine();
        }

        for (int j = 0 ; j < Pokedex.pokedex.size() ; j++) {
            if (Pokedex.pokedex.get(j).containsValue(pokemonName)) {
                Object[] toArray = Pokedex.pokedex.get(j).values().toArray();
                pokemonType1 = toArray[1].toString();
                pokemonType2 = toArray[2].toString();
                pokemonHp = Integer.parseInt(toArray[3].toString());
                pokemonAtk = Integer.parseInt(toArray[4].toString());
                pokemonDef = Integer.parseInt(toArray[5].toString());
                pokemonSpd = Integer.parseInt(toArray[6].toString());
            }
        }

        return new ConcretePokemon(pokemonName, new ConcreteType(pokemonType1), new ConcreteType(pokemonType2), new Stats(pokemonHp, pokemonAtk, pokemonDef, pokemonSpd));
    }
}
