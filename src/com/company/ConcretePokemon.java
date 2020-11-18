package com.company;

public class ConcretePokemon {
    public String name;
    public int hp;
    public int atk;
    public int def;
    public int spd;

    ConcretePokemon(String name, Stats stats) {
        this.name = name;
        this.hp = stats.hp;
        this.atk = stats.atk;
        this.def = stats.def;
        this.spd = stats.spd;
    }
}
