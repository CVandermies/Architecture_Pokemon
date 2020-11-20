package com.company;

public class ConcretePokemon extends PokemonBuilder {
    public String name;
    public int hp;
    public int atk;
    public int def;
    public int spd;
    public ConcreteType type;

    ConcretePokemon(String name, ConcreteType type, Stats stats) {
        this.name = name;
        this.hp = stats.hp;
        this.atk = stats.atk;
        this.def = stats.def;
        this.spd = stats.spd;
        this.type = type;
    }
}
