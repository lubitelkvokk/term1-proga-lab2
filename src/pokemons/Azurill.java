package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.moves.Azurill.*;


public class Azurill extends Pokemon {
//    String name;
//    int level;

    public Azurill(String name, int level) {
        super(name, level);
        setStats(50, 20, 40, 20, 40, 20);
        setType(Type.NORMAL, Type.FAIRY);
        setMove(new Swagger(), new Blizzard());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }
}
