package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FightTest {

    @Test
    public void attack() {
        ConcretePokemon squirtle = new ConcretePokemon("Squirtle", new ConcreteType("Water"), new ConcreteType(""), new Stats(50,48,65,43));
        ConcretePokemon pikachu = new ConcretePokemon("Pikachu", new ConcreteType("Electric"),new ConcreteType(""), new Stats(35,55,40,90));
        Fight.attack(pikachu, squirtle);

        assertEquals(35, pikachu.hp);
    }

    @Test
    public void winner() {
        ConcretePokemon squirtle = new ConcretePokemon("Squirtle", new ConcreteType("Water"), new ConcreteType(""), new Stats(10,48,65,43));
        ConcretePokemon pikachu = new ConcretePokemon("Pikachu", new ConcreteType("Electric"), new ConcreteType(""), new Stats(35,55,40,90));
        assertEquals("Pikachu", Fight.winner(squirtle, pikachu));
    }

    @Test
    public void zeroAtk() {
        ConcretePokemon squirtle = new ConcretePokemon("Squirtle", new ConcreteType("Water"), new ConcreteType(""), new Stats(10,0,65,43));
        ConcretePokemon pikachu = new ConcretePokemon("Pikachu", new ConcreteType("Electric"), new ConcreteType(""), new Stats(35,0,40,90));
        assertEquals("Both attacks = 0, this fight will last forever and ever and ever ...", Fight.winner(squirtle, pikachu));
    }

    @Test
    public void speed() {
        ConcretePokemon pokemon1 = new ConcretePokemon("Charles", new ConcreteType("Electric"), new ConcreteType(""), new Stats(35,50,30,11));
        ConcretePokemon pokemon2 = new ConcretePokemon("Math", new ConcreteType("Fire"), new ConcreteType(""), new Stats(35,50,30,10));
        assertEquals("Charles", Fight.winner(pokemon1, pokemon2));
        ConcretePokemon pokemon3 = new ConcretePokemon("Charles", new ConcreteType("Electric"), new ConcreteType(""), new Stats(35,50,30,10));
        ConcretePokemon pokemon4 = new ConcretePokemon("Math", new ConcreteType("Fire"), new ConcreteType(""), new Stats(35,50,30,11));
        assertEquals("Math", Fight.winner(pokemon3, pokemon4));
    }

    @Test
    public void Bonus() {
        ConcretePokemon pokemon1 = new ConcretePokemon("Charles", new ConcreteType("Normal"), new ConcreteType(""), new Stats(35,50,30,11));
        ConcretePokemon pokemon2 = new ConcretePokemon("Math", new ConcreteType("Fight"), new ConcreteType(""), new Stats(35,50,30,10));
        assertEquals("Math", Fight.winner(pokemon1, pokemon2));
        ConcretePokemon pokemon3 = new ConcretePokemon("Charles", new ConcreteType("Fight"), new ConcreteType(""), new Stats(35,50,30,10));
        ConcretePokemon pokemon4 = new ConcretePokemon("Math", new ConcreteType("Normal"), new ConcreteType(""), new Stats(35,50,30,11));
        assertEquals("Charles", Fight.winner(pokemon3, pokemon4));
    }

    @Test
    public void instantDeath() {
        ConcretePokemon pokemon1 = new ConcretePokemon("Charles", new ConcreteType("Normal"), new ConcreteType(""), new Stats(0,1000,1000,11));
        ConcretePokemon pokemon2 = new ConcretePokemon("Math", new ConcreteType("Normal"), new ConcreteType(""), new Stats(35,50,30,10));
        assertEquals("Math", Fight.winner(pokemon1, pokemon2));
        Fight.attack(pokemon1, pokemon2);
        assertEquals(35, pokemon2.hp);
        ConcretePokemon pokemon3 = new ConcretePokemon("Charles", new ConcreteType("Normal"), new ConcreteType(""), new Stats(0,1000,1000,10));
        ConcretePokemon pokemon4 = new ConcretePokemon("Math", new ConcreteType("Normal"), new ConcreteType(""), new Stats(35,50,30,11));
        assertEquals("Math", Fight.winner(pokemon3, pokemon4));
        Fight.attack(pokemon3, pokemon4);
        assertEquals(35, pokemon4.hp);
    }

    @Test
    public void metrics() {
        long start = System.nanoTime();
        winner();
        long finish = System.nanoTime();
        long elapsedTime = finish - start;
        double elapsedTimeInSeconds = (double) elapsedTime / 1_000_000;
        System.out.println(elapsedTimeInSeconds + " milliseconds");
    }

}