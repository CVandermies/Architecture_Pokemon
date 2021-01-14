package com.company;

import java.util.Scanner;

public class Fight extends TypeBuilder {
    static public String winner;

    static void attack(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        String attack;
        double bonus;

        int press = 1;
        Scanner myObj = new Scanner(System.in);

        System.out.println("\n" + pokemon1.name + " attacks");
        if (pokemon1.type2.name != "") {
            System.out.println("\"1\" for : " + pokemon1.type1.name + " attack");
            System.out.println("\"2\" for : " + pokemon1.type2.name + " attack");
            press = myObj.nextInt();
            while (press != 1 && press != 2) {
                System.out.println("\nYou must enter \"1\" or \"2\", please retry");
                press = myObj.nextInt();
            }
        }
        else {
            System.out.println("\"1\" for : " + pokemon1.type1.name + " attack");
            press = myObj.nextInt();
            while (press != 1) {
                System.out.println("\nYou must enter \"1\", please retry");
                press = myObj.nextInt();
            }
        }
        if (press == 1) {
            attack = pokemon1.type1.name;
        }
        else {
            attack = pokemon1.type2.name;
        }
        bonus = affinities.get(attack).get(pokemon2.type1.name);
        if (pokemon2.type2.name != "") {
            bonus *= affinities.get(attack).get(pokemon2.type2.name);
        }
        if (pokemon1.atk!=0 & pokemon1.hp!=0) {
            int step = (int) (bonus*pokemon1.atk - pokemon2.def);
            if (step>0) {
                pokemon2.hp = pokemon2.hp - step;
            }
            else {
                pokemon2.hp = pokemon2.hp + step;
            }
        }
    }

//    static double bonus(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
//        return affinities.get(pokemon1.type1.name).get(pokemon2.type1.name);
//    }
//
//    static void attack(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
//        if (pokemon1.atk!=0 & pokemon1.hp!=0) {
//            int step = (int) (bonus(pokemon1,pokemon2) * pokemon1.atk-pokemon2.def);
//            if (step>0) {
//                pokemon2.hp = pokemon2.hp - step;
//            }
//            else {
//                pokemon2.hp = pokemon2.hp + step;
//            }
//        }
//    }

    static String winner(ConcretePokemon pokemon1, ConcretePokemon pokemon2) {
        int i = 1;

        while ((pokemon1.hp > 0) && (pokemon2.hp > 0)) {
            if (pokemon1.atk==0 & pokemon2.atk==0) {
                return "Both attacks = 0, this fight will last forever and ever and ever ...";
            }
            ConcretePokemon second;
            ConcretePokemon first;
            if (pokemon1.spd > pokemon2.spd) {
                first = pokemon1;
                second = pokemon2;
            }
            else if (pokemon1.spd == pokemon2.spd) {
                int headsOrTails = (int) (Math.random() * (2));
                if (headsOrTails ==0) {
                    first = pokemon1;
                    second = pokemon2;
                }
                else {
                    first = pokemon2;
                    second = pokemon1;
                }
            }
            else {
                first = pokemon2;
                second = pokemon1;
            }
            System.out.println("\n" + first.name + " VS " + second.name + ": Turn #" + i);
            attack(first, second);
            System.out.println(first.name + " attacks → HP " + second.name + " = " + second.hp);
            if (second.hp>0) {
                attack(second, first);
                System.out.println(second.name + " attacks → HP " + first.name + " = " + first.hp);
            }
            i += 1;
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
        winner = winner(pokemon1, pokemon2);
    }
}
