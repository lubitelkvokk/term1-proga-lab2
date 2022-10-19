package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.moves.Azurill.Swagger;
import src.moves.Marill.BellyDrum;


public class Marill extends Azurill {
//    String name;
//    int level;

    public Marill(String name, int level) {
        super(name, level);
        setStats(70, 20, 50, 20, 50, 40);
        setType(Type.WATER, Type.FAIRY);
        addMove(new BellyDrum());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }


}
