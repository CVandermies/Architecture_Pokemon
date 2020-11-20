package com.company;

public class Fight extends TypeBuilder
{
    static public String winner;
    static private ConcretePokemon first;
    static private ConcretePokemon second;

    static double bonus(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        return affinities.get(pokemon1.type.name).get(pokemon2.type.name);
    }

    static void attack(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        if(pokemon1.atk!=0 & pokemon1.hp!=0) {
            int step = (int) (bonus(pokemon1,pokemon2) * pokemon1.atk-pokemon2.def);
            if(step>0){
                pokemon2.hp = pokemon2.hp - step;
            }
        }
    }

    static String winner(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        while (pokemon1.hp > 0 & pokemon2.hp > 0) {

        }
    }

    Fight(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        winner = winner(pokemon1 ,pokemon2);
    }
}
