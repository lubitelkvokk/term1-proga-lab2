package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.riolu.*;
import org.itmo.lab2.moves.regice.Rest;

public class Riolu extends Pokemon {
//    String name;
//    int level;

    public Riolu(String name, int level) {
        super(name, level);
        setStats(40, 70, 40, 35, 40, 60);
        setType(Type.FIGHTING);
        setMove(new SwordsDance(), new Confide(), new Rest());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }
}
