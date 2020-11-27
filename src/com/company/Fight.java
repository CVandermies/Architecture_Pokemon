package com.company;

public class Fight extends TypeBuilder {
    static public String winner;
    static private ConcretePokemon first;
    static private ConcretePokemon second;
    static private int headsOrTails;
    static private int i;

    static double bonus(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        return affinities.get(pokemon1.type.name).get(pokemon2.type.name);
    }

    static void attack(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        if (pokemon1.atk!=0 & pokemon1.hp!=0) {
            int step = (int) (bonus(pokemon1,pokemon2) * pokemon1.atk-pokemon2.def);
            if (step>0) {
                pokemon2.hp = pokemon2.hp - step;
            }
            else {
                pokemon2.hp = pokemon2.hp + step;
            }
        }
    }

    static String winner(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        i = 1;
        while (pokemon1.hp > 0 & pokemon2.hp > 0) {
            if (pokemon1.spd > pokemon2.spd) {
                first = pokemon1;
                second = pokemon2;
            }
            if (pokemon1.spd < pokemon2.spd) {
                first = pokemon2;
                second = pokemon1;
            }
            if (pokemon1.spd == pokemon2.spd) {
                headsOrTails = (int) (Math.random() * (2));
                if (headsOrTails==0) {
                    first = pokemon1;
                    second = pokemon2;
                }
                else {
                    first = pokemon2;
                    second = pokemon1;
                }
            }
            System.out.println("\nTurn #" + i);
            attack(first, second);
            System.out.println(first.name + " attacks → HP " + second.name + " = " + second.hp);
            if (second.hp>0) {
                attack(second, first);
            }
            System.out.println(second.name + " attacks → HP " + first.name + " = " + first.hp);
            i += 1;
            if (pokemon1.atk==0 & pokemon2.atk==0) {
                return "Both attacks = 0, this fight will last forever and ever and ever ...";
            }
        }
        if (pokemon2.hp<=0) {
            return pokemon1.name;
        }
        else
        {
            return pokemon2.name;
        }
    }
    Fight(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        winner = winner(pokemon1 ,pokemon2);
    }
}
