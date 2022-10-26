package org.itmo.lab2.moves.Regice;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

import static java.lang.Math.random;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (random() <= 0.3)
            Effect.paralyze(p);
    }


    @Override
    protected String describe() {
        return "применяет Thunder";
    }

}

