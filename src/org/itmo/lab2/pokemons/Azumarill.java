package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.azumarill.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;




public class Azumarill extends Marill {
//    String name;
//    int level;

    public Azumarill(String name, int level) {
        super(name, level);
        setStats(100, 50, 80, 60, 80, 50);
        addMove(new AquaRing());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }
}
