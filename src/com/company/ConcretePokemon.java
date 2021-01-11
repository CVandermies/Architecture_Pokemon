package com.company;

public class ConcretePokemon extends PokemonBuilder {
    public String name;
    public ConcreteType type1;
    public ConcreteType type2;
    public int hp;
    public int atk;
    public int def;
    public int spd;

    ConcretePokemon(String name, ConcreteType type1, ConcreteType type2, Stats stats) {
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = stats.hp;
        this.atk = stats.atk;
        this.def = stats.def;
        this.spd = stats.spd;
    }

}
