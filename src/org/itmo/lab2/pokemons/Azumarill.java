package org.itmo.lab2.pokemons;

import org.itmo.lab2.moves.Azumarill.AquaRing;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.Azurill.Swagger;



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
