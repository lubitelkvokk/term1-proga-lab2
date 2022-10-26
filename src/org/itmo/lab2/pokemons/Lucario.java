package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.Lucario.*;


public class Lucario extends Riolu {
//    String name;
//    int level;

    public Lucario(String name, int level) {
        super(name, level);
        setStats(70, 110, 70, 115, 70, 90);
        addType(Type.STEEL);
        addMove(new CloseCombat());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }
}
