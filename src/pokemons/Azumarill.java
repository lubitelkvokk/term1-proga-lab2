package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.moves.Azumarill.AquaRing;
import src.moves.Azurill.Swagger;
import src.moves.Lucario.*;


public class Azumarill extends Marill {
//    String name;
//    int level;

    public Azumarill(String name, int level) {
        super(name, level);
        setStats(100, 50, 80, 60, 80, 50);
        addMove(new Swagger());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }
}
