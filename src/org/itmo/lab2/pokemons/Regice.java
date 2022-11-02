package org.itmo.lab2.pokemons;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import org.itmo.lab2.moves.regice.*;


public class Regice extends Pokemon {

    public Regice(String name, int level) {
        super(name, level);
        setStats(80,50,100,100,200,50);
        setType(Type.ICE);
        setMove(new DoubleTeam(),new Thunder(), new ZapCannon(), new Rest());

    }



}
