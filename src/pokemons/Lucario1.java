package src.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import src.moves.Lucario.CloseCombat;
import src.moves.Lucario.CloseCombat1;

public class Lucario1 extends Pokemon {
//    String name;
//    int level;

    public Lucario1(String name, int level) {
        super(name, level);
        setStats(700, 110, 70, 115, 70, 90);
        setType(Type.FIGHTING, Type.STEEL);
        //addMove(new CloseCombat1());

    }
}
