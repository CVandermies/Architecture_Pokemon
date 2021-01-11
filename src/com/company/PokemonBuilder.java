package com.company;

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

        for (int i = 0 ; i < Pokedex.pokedex.size() ; i++) {
            if (Pokedex.pokedex.get(i).containsValue(pokemonName)) {
                Object[] toArray = Pokedex.pokedex.get(i).values().toArray();
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
