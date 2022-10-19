package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.moves.Lucario.*;


public class Lucario extends Riolu {
//    String name;
//    int level;

    public Lucario(String name, int level) {
        super(name, level);
        setStats(700, 110, 70, 115, 70, 90);
        setType(Type.FIGHTING, Type.STEEL);
        setMove(new CloseCombat());
        //addMove(new SwordsDance());
        //addMove(new CloseCombat());

    }
}
